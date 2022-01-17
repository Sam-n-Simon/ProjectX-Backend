package de.sns.database.entity;

import de.sns.database.enums.Haltung;
import de.sns.database.enums.Schmerz;

import javax.persistence.*;

@Entity
@Table (name = "`Test`")
public class Test {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`person`", nullable = false)
    private Person person;

    // TODO: In Date ändern
    @Column (name = "`datum`", nullable = false)
    private String datum;

    // TODO: In Time ändern
    @Column (name = "`zeit`", nullable = false)
    private String zeit;

    @Column (name = "`trainer`", nullable = false)
    private String trainer;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`blutdruck`", nullable = false)
    private Blutdruck blutdruck;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`beschwerden`", nullable = false)
    private Beschwerden beschwerden;

    @Column (name = "`zusatz`", nullable = false)
    private String zusatz;

    // TODO: In Unterschrift ändern
    @Column (name = "`unterschrift`", nullable = false)
    private String unterschrift;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`konstStatik`", nullable = false)
    private KonstStatik konstStatik;

    @Column (name = "`puls`", nullable = false)
    private Integer puls;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`zielePerson`", nullable = false)
    private Ziele zielePerson;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`zieleTrainer`", nullable = false)
    private Ziele zieleTrainer;

    @Column (name = "trainingsMoeglichkeit", nullable = false)
    private Integer trainingsMoeglichkeit;

    @Column (name = "trainingsUmfang", nullable = false)
    private Integer trainingsUmfang;

    @Enumerated (EnumType.ORDINAL)
    @Column (name = "`schmerzenAkut`", nullable = false)
    private Schmerz schmerzenAkut;

    @Enumerated (EnumType.ORDINAL)
    @Column (name = "`schmerzenAllgemein`", nullable = false)
    private Schmerz schmerzenAllgemein;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "`koerperaufbauanalyse`", nullable = false)
    private Koerperaufbauanalyse koerperaufbauanalyse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getZeit() {
        return zeit;
    }

    public void setZeit(String zeit) {
        this.zeit = zeit;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public Blutdruck getBlutdruck() {
        return blutdruck;
    }

    public void setBlutdruck(Blutdruck blutdruck) {
        this.blutdruck = blutdruck;
    }

    public Beschwerden getBeschwerden() {
        return beschwerden;
    }

    public void setBeschwerden(Beschwerden beschwerden) {
        this.beschwerden = beschwerden;
    }

    public String getZusatz() {
        return zusatz;
    }

    public void setZusatz(String zusatz) {
        this.zusatz = zusatz;
    }

    public String getUnterschrift() {
        return unterschrift;
    }

    public void setUnterschrift(String unterschrift) {
        this.unterschrift = unterschrift;
    }

    public KonstStatik getKonstStatik() {
        return konstStatik;
    }

    public void setKonstStatik(KonstStatik konstStatik) {
        this.konstStatik = konstStatik;
    }

    public Integer getPuls() {
        return puls;
    }

    public void setPuls(Integer puls) {
        this.puls = puls;
    }

    public Ziele getZielePerson() {
        return zielePerson;
    }

    public void setZielePerson(Ziele zielePerson) {
        this.zielePerson = zielePerson;
    }

    public Ziele getZieleTrainer() {
        return zieleTrainer;
    }

    public void setZieleTrainer(Ziele zieleTrainer) {
        this.zieleTrainer = zieleTrainer;
    }

    public Integer getTrainingsMoeglichkeit() {
        return trainingsMoeglichkeit;
    }

    public void setTrainingsMoeglichkeit(Integer trainingsMoeglichkeit) {
        this.trainingsMoeglichkeit = trainingsMoeglichkeit;
    }

    public Integer getTrainingsUmfang() {
        return trainingsUmfang;
    }

    public void setTrainingsUmfang(Integer trainingsUmfang) {
        this.trainingsUmfang = trainingsUmfang;
    }

    public Schmerz getSchmerzenAkut() {
        return schmerzenAkut;
    }

    public void setSchmerzenAkut(Schmerz schmerzenAkut) {
        this.schmerzenAkut = schmerzenAkut;
    }

    public Schmerz getSchmerzenAllgemein() {
        return schmerzenAllgemein;
    }

    public void setSchmerzenAllgemein(Schmerz schmerzenAllgemein) {
        this.schmerzenAllgemein = schmerzenAllgemein;
    }

    public Koerperaufbauanalyse getKoerperaufbauanalyse() {
        return koerperaufbauanalyse;
    }

    public void setKoerperaufbauanalyse(Koerperaufbauanalyse koerperaufbauanalyse) {
        this.koerperaufbauanalyse = koerperaufbauanalyse;
    }
}
