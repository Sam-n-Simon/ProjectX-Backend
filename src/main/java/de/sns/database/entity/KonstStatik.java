package de.sns.database.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table (name = "`KonstStatik`")
public class KonstStatik {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "`hueftumfang`", nullable = false)
    private Double hueftumfang;

    @Column (name = "`tailleumfang`", nullable = false)
    private Double tailleumfang;

    @Column (name = "`schulterstand`", nullable = false)
    private Double schulterstand;

    @Column (name = "`hueftstand`", nullable = false)
    private Double hueftstand;

    @Column (name = "`isg`", nullable = false)
    private Double isg;

    @Column (name = "`beinachse`", nullable = false)
    private Double beinachse;

    @Column (name = "`wirbelsaeule`", nullable = false)
    private Double wirbelsaeule;

    @Column (name = "`groesse`", nullable = false)
    private Double groesse;

    @Column (name = "`kg`", nullable = false)
    private Double kg;

    @Column (name = "`beinlaenge`", nullable = false)
    private Double beinlaenge;

    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public Double getHueftumfang() {
        return hueftumfang;
    }

    public void setHueftumfang(@NotNull Double hueftumfang) {
        this.hueftumfang = hueftumfang;
    }

    @NotNull
    public Double getTailleumfang() {
        return tailleumfang;
    }

    public void setTailleumfang(@NotNull Double tailleumfang) {
        this.tailleumfang = tailleumfang;
    }

    @NotNull
    public Double getSchulterstand() {
        return schulterstand;
    }

    public void setSchulterstand(@NotNull Double schulterstand) {
        this.schulterstand = schulterstand;
    }

    @NotNull
    public Double getHueftstand() {
        return hueftstand;
    }

    public void setHueftstand(@NotNull Double hueftstand) {
        this.hueftstand = hueftstand;
    }

    @NotNull
    public Double getIsg() {
        return isg;
    }

    public void setIsg(@NotNull Double isg) {
        this.isg = isg;
    }

    @NotNull
    public Double getBeinachse() {
        return beinachse;
    }

    public void setBeinachse(@NotNull Double beinachse) {
        this.beinachse = beinachse;
    }

    @NotNull
    public Double getWirbelsaeule() {
        return wirbelsaeule;
    }

    public void setWirbelsaeule(@NotNull Double wirbelsaeule) {
        this.wirbelsaeule = wirbelsaeule;
    }

    @NotNull
    public Double getGroesse() {
        return groesse;
    }

    public void setGroesse(@NotNull Double groesse) {
        this.groesse = groesse;
    }

    @NotNull
    public Double getKg() {
        return kg;
    }

    public void setKg(@NotNull Double kg) {
        this.kg = kg;
    }

    @NotNull
    public Double getBeinlaenge() {
        return beinlaenge;
    }

    public void setBeinlaenge(@NotNull Double beinlaenge) {
        this.beinlaenge = beinlaenge;
    }
}
