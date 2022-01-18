package de.sns.database.entity;

import de.sns.database.enums.Haltung;
import de.sns.database.enums.Schmerz;
import org.jetbrains.annotations.NotNull;

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

    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public Person getPerson() {
        return person;
    }

    public void setPerson(@NotNull Person person) {
        this.person = person;
    }

    @NotNull
    public String getDatum() {
        return datum;
    }

    public void setDatum(@NotNull String datum) {
        this.datum = datum;
    }

    @NotNull
    public String getZeit() {
        return zeit;
    }

    public void setZeit(@NotNull String zeit) {
        this.zeit = zeit;
    }

    @NotNull
    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(@NotNull String trainer) {
        this.trainer = trainer;
    }

    @NotNull
    public Blutdruck getBlutdruck() {
        return blutdruck;
    }

    public void setBlutdruck(@NotNull Blutdruck blutdruck) {
        this.blutdruck = blutdruck;
    }

    @NotNull
    public Beschwerden getBeschwerden() {
        return beschwerden;
    }

    public void setBeschwerden(@NotNull Beschwerden beschwerden) {
        this.beschwerden = beschwerden;
    }

    @NotNull
    public String getZusatz() {
        return zusatz;
    }

    public void setZusatz(@NotNull String zusatz) {
        this.zusatz = zusatz;
    }

    @NotNull
    public String getUnterschrift() {
        return unterschrift;
    }

    public void setUnterschrift(@NotNull String unterschrift) {
        this.unterschrift = unterschrift;
    }

    @NotNull
    public KonstStatik getKonstStatik() {
        return konstStatik;
    }

    public void setKonstStatik(@NotNull KonstStatik konstStatik) {
        this.konstStatik = konstStatik;
    }

    @NotNull
    public Integer getPuls() {
        return puls;
    }

    public void setPuls(@NotNull Integer puls) {
        this.puls = puls;
    }

    @NotNull
    public Ziele getZielePerson() {
        return zielePerson;
    }

    public void setZielePerson(@NotNull Ziele zielePerson) {
        this.zielePerson = zielePerson;
    }

    @NotNull
    public Ziele getZieleTrainer() {
        return zieleTrainer;
    }

    public void setZieleTrainer(@NotNull Ziele zieleTrainer) {
        this.zieleTrainer = zieleTrainer;
    }

    @NotNull
    public Integer getTrainingsMoeglichkeit() {
        return trainingsMoeglichkeit;
    }

    public void setTrainingsMoeglichkeit(@NotNull Integer trainingsMoeglichkeit) {
        this.trainingsMoeglichkeit = trainingsMoeglichkeit;
    }

    @NotNull
    public Integer getTrainingsUmfang() {
        return trainingsUmfang;
    }

    public void setTrainingsUmfang(@NotNull Integer trainingsUmfang) {
        this.trainingsUmfang = trainingsUmfang;
    }

    @NotNull
    public Schmerz getSchmerzenAkut() {
        return schmerzenAkut;
    }

    public void setSchmerzenAkut(@NotNull Schmerz schmerzenAkut) {
        this.schmerzenAkut = schmerzenAkut;
    }

    @NotNull
    public Schmerz getSchmerzenAllgemein() {
        return schmerzenAllgemein;
    }

    public void setSchmerzenAllgemein(@NotNull Schmerz schmerzenAllgemein) {
        this.schmerzenAllgemein = schmerzenAllgemein;
    }

    @NotNull
    public Koerperaufbauanalyse getKoerperaufbauanalyse() {
        return koerperaufbauanalyse;
    }

    public void setKoerperaufbauanalyse(@NotNull Koerperaufbauanalyse koerperaufbauanalyse) {
        this.koerperaufbauanalyse = koerperaufbauanalyse;
    }
}
