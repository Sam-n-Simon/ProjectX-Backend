package de.sns.database.entity;

import org.jetbrains.annotations.NotNull;

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


    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public String getKraft3() {
        return kraft3;
    }

    public void setKraft3(@NotNull String kraft3) {
        this.kraft3 = kraft3;
    }

    @NotNull
    public String getKraftA() {
        return kraftA;
    }

    public void setKraftA(@NotNull String kraftA) {
        this.kraftA = kraftA;
    }

    @NotNull
    public String getAusdauer3() {
        return ausdauer3;
    }

    public void setAusdauer3(@NotNull String ausdauer3) {
        this.ausdauer3 = ausdauer3;
    }

    @NotNull
    public String getAusdauerA() {
        return ausdauerA;
    }

    public void setAusdauerA(@NotNull String ausdauerA) {
        this.ausdauerA = ausdauerA;
    }

    @NotNull
    public String getBeweglichkeit3() {
        return beweglichkeit3;
    }

    public void setBeweglichkeit3(@NotNull String beweglichkeit3) {
        this.beweglichkeit3 = beweglichkeit3;
    }

    @NotNull
    public String getBeweglichkeitA() {
        return beweglichkeitA;
    }

    public void setBeweglichkeitA(@NotNull String beweglichkeitA) {
        this.beweglichkeitA = beweglichkeitA;
    }

    @NotNull
    public String getGewicht3() {
        return gewicht3;
    }

    public void setGewicht3(@NotNull String gewicht3) {
        this.gewicht3 = gewicht3;
    }

    @NotNull
    public String getGewichtA() {
        return gewichtA;
    }

    public void setGewichtA(@NotNull String gewichtA) {
        this.gewichtA = gewichtA;
    }

    @NotNull
    public String getSchmerz3() {
        return schmerz3;
    }

    public void setSchmerz3(@NotNull String schmerz3) {
        this.schmerz3 = schmerz3;
    }

    @NotNull
    public String getSchmerzA() {
        return schmerzA;
    }

    public void setSchmerzA(@NotNull String schmerzA) {
        this.schmerzA = schmerzA;
    }

    @NotNull
    public String getBalanceK3() {
        return balance3;
    }

    public void setBalanceK3(@NotNull String balanceK3) {
        this.balance3 = balanceK3;
    }

    @NotNull
    public String getBalanceA() {
        return balanceA;
    }

    public void setBalanceA(@NotNull String balanceA) {
        this.balanceA = balanceA;
    }

    @NotNull
    public String getSontigesK() {
        return sontiges;
    }

    public void setSontigesK(@NotNull String sontigesK) {
        this.sontiges = sontigesK;
    }
}
