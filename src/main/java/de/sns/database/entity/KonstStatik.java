package de.sns.database.entity;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHueftumfang() {
        return hueftumfang;
    }

    public void setHueftumfang(Double hueftumfang) {
        this.hueftumfang = hueftumfang;
    }

    public Double getTailleumfang() {
        return tailleumfang;
    }

    public void setTailleumfang(Double tailleumfang) {
        this.tailleumfang = tailleumfang;
    }

    public Double getSchulterstand() {
        return schulterstand;
    }

    public void setSchulterstand(Double schulterstand) {
        this.schulterstand = schulterstand;
    }

    public Double getHueftstand() {
        return hueftstand;
    }

    public void setHueftstand(Double hueftstand) {
        this.hueftstand = hueftstand;
    }

    public Double getIsg() {
        return isg;
    }

    public void setIsg(Double isg) {
        this.isg = isg;
    }

    public Double getBeinachse() {
        return beinachse;
    }

    public void setBeinachse(Double beinachse) {
        this.beinachse = beinachse;
    }

    public Double getWirbelsaeule() {
        return wirbelsaeule;
    }

    public void setWirbelsaeule(Double wirbelsaeule) {
        this.wirbelsaeule = wirbelsaeule;
    }

    public Double getGroesse() {
        return groesse;
    }

    public void setGroesse(Double groesse) {
        this.groesse = groesse;
    }

    public Double getKg() {
        return kg;
    }

    public void setKg(Double kg) {
        this.kg = kg;
    }

    public Double getBeinlaenge() {
        return beinlaenge;
    }

    public void setBeinlaenge(Double beinlaenge) {
        this.beinlaenge = beinlaenge;
    }
}
