package de.sns.database.entity;

import de.sns.database.enums.Haltung;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "`Person`")
public class Person {

    @Id
    @Column (name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "`name`", nullable = false)
    private String name;

    @Column (name = "`vorname`", nullable = false)
    private String vorname;

    // TODO: In Date ändern
    @Column (name = "`geburtsdatum`", nullable = false)
    private String geburtsdatum;

    @Column (name = "`beruf`", nullable = false)
    private String beruf;

    @Enumerated (EnumType.ORDINAL)
    @Column (name = "`vorwiegendeHaltung`", nullable = false)
    private Haltung vorwiegendeHaltung;

    @Column (name = "`sportlicheAktivitaeten`", nullable = false)
    private String sportlicheAktivitaeten;

    @OneToMany (mappedBy = "person", cascade = CascadeType.ALL)
    private List<Test> tests;

    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    @NotNull
    public String getVorname() {
        return vorname;
    }

    public void setVorname(@NotNull String vorname) {
        this.vorname = vorname;
    }

    @NotNull
    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(@NotNull String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @NotNull
    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(@NotNull String beruf) {
        this.beruf = beruf;
    }

    @NotNull
    public Haltung getVorwiegendeHaltung() {
        return vorwiegendeHaltung;
    }

    public void setVorwiegendeHaltung(@NotNull Haltung vorwiegendeHaltung) {
        this.vorwiegendeHaltung = vorwiegendeHaltung;
    }

    @NotNull
    public String getSportlicheAktivitaeten() {
        return sportlicheAktivitaeten;
    }

    public void setSportlicheAktivitaeten(@NotNull String sportlicheAktivitaeten) {
        this.sportlicheAktivitaeten = sportlicheAktivitaeten;
    }

    @NotNull
    public List<Test> getTests() {
        return tests;
    }

    public void setTests(@NotNull List<Test> tests) {
        this.tests = tests;
    }
}
