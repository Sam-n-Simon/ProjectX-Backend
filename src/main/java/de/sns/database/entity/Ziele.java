package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Ziele`")
public class Ziele {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column (name = "kraftK3", nullable = false)
    private String kraftK3;

    @Column (name = "kraftKa", nullable = false)
    private String kraftKa;

    @Column (name = "ausdauerK3", nullable = false)
    private String ausdauerK3;

    @Column (name = "ausdauerKa", nullable = false)
    private String ausdauerKa;

    @Column (name = "beweglichkeitK3", nullable = false)
    private String beweglichkeitK3;

    @Column (name = "beweglichkeitKa", nullable = false)
    private String beweglichkeitKa;

    @Column (name = "gewichtK3", nullable = false)
    private String gewichtK3;

    @Column (name = "gewichtKa", nullable = false)
    private String gewichtKa;

    @Column (name = "schmerzK3", nullable = false)
    private String schmerzK3;

    @Column (name = "schmerzKa", nullable = false)
    private String schmerzKa;

    @Column (name = "balanceK3", nullable = false)
    private String balanceK3;

    @Column (name = "balanceKa", nullable = false)
    private String balanceKa;

    @Column (name = "sonstigesK", nullable = false)
    private String sontigesK;

    @Column (name = "kraftT3", nullable = false)
    private String kraftT3;

    @Column (name = "kraftTa", nullable = false)
    private String kraftTa;

    @Column (name = "ausdauerT3", nullable = false)
    private String ausdauerT3;

    @Column (name = "ausdauerTa", nullable = false)
    private String ausdauerTa;

    @Column (name = "beweglichkeitT3", nullable = false)
    private String beweglichkeitT3;

    @Column (name = "beweglichkeitTa", nullable = false)
    private String beweglichkeitTa;

    @Column (name = "gewichtT3", nullable = false)
    private String gewichtT3;

    @Column (name = "gewichtTa", nullable = false)
    private String gewichtTa;

    @Column (name = "schmerzT3", nullable = false)
    private String schmerzT3;

    @Column (name = "schmerzTa", nullable = false)
    private String schmerzTa;

    @Column (name = "balanceT3", nullable = false)
    private String balanceT3;

    @Column (name = "balanceTa", nullable = false)
    private String balanceTa;

    @Column (name = "sonstigesT", nullable = false)
    private String sontigesT;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKraftK3() {
        return kraftK3;
    }

    public void setKraftK3(String kraftK3) {
        this.kraftK3 = kraftK3;
    }

    public String getKraftKa() {
        return kraftKa;
    }

    public void setKraftKa(String kraftKa) {
        this.kraftKa = kraftKa;
    }

    public String getAusdauerK3() {
        return ausdauerK3;
    }

    public void setAusdauerK3(String ausdauerK3) {
        this.ausdauerK3 = ausdauerK3;
    }

    public String getAusdauerKa() {
        return ausdauerKa;
    }

    public void setAusdauerKa(String ausdauerKa) {
        this.ausdauerKa = ausdauerKa;
    }

    public String getBeweglichkeitK3() {
        return beweglichkeitK3;
    }

    public void setBeweglichkeitK3(String beweglichkeitK3) {
        this.beweglichkeitK3 = beweglichkeitK3;
    }

    public String getBeweglichkeitKa() {
        return beweglichkeitKa;
    }

    public void setBeweglichkeitKa(String beweglichkeitKa) {
        this.beweglichkeitKa = beweglichkeitKa;
    }

    public String getGewichtK3() {
        return gewichtK3;
    }

    public void setGewichtK3(String gewichtK3) {
        this.gewichtK3 = gewichtK3;
    }

    public String getGewichtKa() {
        return gewichtKa;
    }

    public void setGewichtKa(String gewichtKa) {
        this.gewichtKa = gewichtKa;
    }

    public String getSchmerzK3() {
        return schmerzK3;
    }

    public void setSchmerzK3(String schmerzK3) {
        this.schmerzK3 = schmerzK3;
    }

    public String getSchmerzKa() {
        return schmerzKa;
    }

    public void setSchmerzKa(String schmerzKa) {
        this.schmerzKa = schmerzKa;
    }

    public String getBalanceK3() {
        return balanceK3;
    }

    public void setBalanceK3(String balanceK3) {
        this.balanceK3 = balanceK3;
    }

    public String getBalanceKa() {
        return balanceKa;
    }

    public void setBalanceKa(String balanceKa) {
        this.balanceKa = balanceKa;
    }

    public String getSontigesK() {
        return sontigesK;
    }

    public void setSontigesK(String sontigesK) {
        this.sontigesK = sontigesK;
    }

    public String getKraftT3() {
        return kraftT3;
    }

    public void setKraftT3(String kraftT3) {
        this.kraftT3 = kraftT3;
    }

    public String getKraftTa() {
        return kraftTa;
    }

    public void setKraftTa(String kraftTa) {
        this.kraftTa = kraftTa;
    }

    public String getAusdauerT3() {
        return ausdauerT3;
    }

    public void setAusdauerT3(String ausdauerT3) {
        this.ausdauerT3 = ausdauerT3;
    }

    public String getAusdauerTa() {
        return ausdauerTa;
    }

    public void setAusdauerTa(String ausdauerTa) {
        this.ausdauerTa = ausdauerTa;
    }

    public String getBeweglichkeitT3() {
        return beweglichkeitT3;
    }

    public void setBeweglichkeitT3(String beweglichkeitT3) {
        this.beweglichkeitT3 = beweglichkeitT3;
    }

    public String getBeweglichkeitTa() {
        return beweglichkeitTa;
    }

    public void setBeweglichkeitTa(String beweglichkeitTa) {
        this.beweglichkeitTa = beweglichkeitTa;
    }

    public String getGewichtT3() {
        return gewichtT3;
    }

    public void setGewichtT3(String gewichtT3) {
        this.gewichtT3 = gewichtT3;
    }

    public String getGewichtTa() {
        return gewichtTa;
    }

    public void setGewichtTa(String gewichtTa) {
        this.gewichtTa = gewichtTa;
    }

    public String getSchmerzT3() {
        return schmerzT3;
    }

    public void setSchmerzT3(String schmerzT3) {
        this.schmerzT3 = schmerzT3;
    }

    public String getSchmerzTa() {
        return schmerzTa;
    }

    public void setSchmerzTa(String schmerzTa) {
        this.schmerzTa = schmerzTa;
    }

    public String getBalanceT3() {
        return balanceT3;
    }

    public void setBalanceT3(String balanceT3) {
        this.balanceT3 = balanceT3;
    }

    public String getBalanceTa() {
        return balanceTa;
    }

    public void setBalanceTa(String balanceTa) {
        this.balanceTa = balanceTa;
    }

    public String getSontigesT() {
        return sontigesT;
    }

    public void setSontigesT(String sontigesT) {
        this.sontigesT = sontigesT;
    }
}
