package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Ziele`")
public class Ziele {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column (name = "`kraft3`", nullable = false)
    private String kraft3;

    @Column (name = "`kraftA`", nullable = false)
    private String kraftA;

    @Column (name = "`ausdauer3`", nullable = false)
    private String ausdauer3;

    @Column (name = "`ausdauerA`", nullable = false)
    private String ausdauerA;

    @Column (name = "`beweglichkeit3`", nullable = false)
    private String beweglichkeit3;

    @Column (name = "`beweglichkeitA`", nullable = false)
    private String beweglichkeitA;

    @Column (name = "`gewicht3`", nullable = false)
    private String gewicht3;

    @Column (name = "`gewichtA`", nullable = false)
    private String gewichtA;

    @Column (name = "`schmerz3`", nullable = false)
    private String schmerz3;

    @Column (name = "`schmerzA`", nullable = false)
    private String schmerzA;

    @Column (name = "`balance3`", nullable = false)
    private String balance3;

    @Column (name = "`balanceA`", nullable = false)
    private String balanceA;

    @Column (name = "`sonstiges`", nullable = false)
    private String sontiges;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKraft3() {
        return kraft3;
    }

    public void setKraft3(String kraft3) {
        this.kraft3 = kraft3;
    }

    public String getKraftA() {
        return kraftA;
    }

    public void setKraftA(String kraftA) {
        this.kraftA = kraftA;
    }

    public String getAusdauer3() {
        return ausdauer3;
    }

    public void setAusdauer3(String ausdauer3) {
        this.ausdauer3 = ausdauer3;
    }

    public String getAusdauerA() {
        return ausdauerA;
    }

    public void setAusdauerA(String ausdauerA) {
        this.ausdauerA = ausdauerA;
    }

    public String getBeweglichkeit3() {
        return beweglichkeit3;
    }

    public void setBeweglichkeit3(String beweglichkeit3) {
        this.beweglichkeit3 = beweglichkeit3;
    }

    public String getBeweglichkeitA() {
        return beweglichkeitA;
    }

    public void setBeweglichkeitA(String beweglichkeitA) {
        this.beweglichkeitA = beweglichkeitA;
    }

    public String getGewicht3() {
        return gewicht3;
    }

    public void setGewicht3(String gewicht3) {
        this.gewicht3 = gewicht3;
    }

    public String getGewichtA() {
        return gewichtA;
    }

    public void setGewichtA(String gewichtA) {
        this.gewichtA = gewichtA;
    }

    public String getSchmerz3() {
        return schmerz3;
    }

    public void setSchmerz3(String schmerz3) {
        this.schmerz3 = schmerz3;
    }

    public String getSchmerzA() {
        return schmerzA;
    }

    public void setSchmerzA(String schmerzA) {
        this.schmerzA = schmerzA;
    }

    public String getBalanceK3() {
        return balance3;
    }

    public void setBalanceK3(String balanceK3) {
        this.balance3 = balanceK3;
    }

    public String getBalanceA() {
        return balanceA;
    }

    public void setBalanceA(String balanceA) {
        this.balanceA = balanceA;
    }

    public String getSontigesK() {
        return sontiges;
    }

    public void setSontigesK(String sontigesK) {
        this.sontiges = sontigesK;
    }
}
