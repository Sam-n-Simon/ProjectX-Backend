package de.sns;

import de.sns.database.entity.*;
import io.ebean.Database;
import io.ebean.DatabaseFactory;
import io.ebean.config.DatabaseConfig;
import io.ebean.config.dbplatform.h2.H2Platform;
import io.ebean.datasource.DataSourceConfig;
import org.h2.Driver;

import java.io.File;
import java.sql.DriverManager;
import java.util.Arrays;
import java.util.List;

public class ProjectXBackend {

    private Database database;

    public static void main(String[] args) {
        new ProjectXBackend();
    }

    public ProjectXBackend() {
        loadDatabase();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                database.shutdown();
            }
        });
    }

    private void loadDatabase() {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader(getClass().getClassLoader());

        DatabaseConfig databaseConfig = new DatabaseConfig();
        databaseConfig.setRegister(true);
        databaseConfig.setDdlCreateOnly(true);
        databaseConfig.setDefaultServer(true);
        databaseConfig.setDdlRun(true);
        databaseConfig.setDdlGenerate(true);
        databaseConfig.setClasses(getDatabaseClasses());
        databaseConfig.setAutoPersistUpdates(true);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();

        try {
            DriverManager.registerDriver(new Driver());
        } catch (Exception e) {
            e.printStackTrace();
        }

        databaseConfig.setDatabasePlatform(new H2Platform());

        dataSourceConfig.setDriver("org.h2.Driver");
        dataSourceConfig.setUsername("px");
        dataSourceConfig.setPassword("px");
        dataSourceConfig.setUrl(String.format("jdbc:h2:%s;MV_STORE=false", new File("src/test/resources/Database").getAbsoluteFile()));

        databaseConfig.setDataSourceConfig(dataSourceConfig);

        try {
            database = DatabaseFactory.create(databaseConfig);
        } catch(Exception e) {
            databaseConfig.setDdlRun(false);
            database = DatabaseFactory.create(databaseConfig);
        }
        Thread.currentThread().setContextClassLoader(originalClassLoader);
    }

    private List<Class<?>> getDatabaseClasses() {
        return Arrays.asList(
                Beschwerden.class,
                Blutdruck.class,
                Koerperbauanalyse.class,
                KonstStatik.class,
                Ziele.class,
                Person.class,
                Test.class
        );
    }
}
