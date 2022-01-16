package de.sns.database.entity;

import de.sns.database.enums.Haltung;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public Haltung getVorwiegendeHaltung() {
        return vorwiegendeHaltung;
    }

    public void setVorwiegendeHaltung(Haltung vorwiegendeHaltung) {
        this.vorwiegendeHaltung = vorwiegendeHaltung;
    }

    public String getSportlicheAktivitaeten() {
        return sportlicheAktivitaeten;
    }

    public void setSportlicheAktivitaeten(String sportlicheAktivitaeten) {
        this.sportlicheAktivitaeten = sportlicheAktivitaeten;
    }

    public List<Test> getTests() {
        return tests;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
