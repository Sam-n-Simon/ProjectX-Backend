package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Beschwerden`")
public class Beschwerden {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "´akuteBeschwerden´", nullable = false)
    private String akuteBeschwerden;

    @Column (name = "´hauptBeschwerden´", nullable = false)
    private String hauptBeschwerden;

    @Column (name = "´kopfHals´", nullable = false)
    private Boolean kopfHals;

    @Column (name = "´schulter´", nullable = false)
    private Boolean schulter;

    @Column (name = "´handEllenbogenArm´", nullable = false)
    private Boolean handEllenbogenArm;

    @Column (name = "´beckenHuefte´", nullable = false)
    private Boolean beckenHuefte;

    @Column (name = "´oberschenkelKnie´", nullable = false)
    private Boolean oberschenkelKnie;

    @Column (name = "´unterschenkelFuss´", nullable = false)
    private Boolean unterschenkelFuss;

    @Column (name = "´halsWirbelSaeule´", nullable = false)
    private Boolean halsWirbelSaeule;

    @Column (name = "´brustWirbelSaeule´", nullable = false)
    private Boolean brustWirbelSaeule;

    @Column (name = "´lendenWirbelSaeule´", nullable = false)
    private Boolean lendenWirbelSaeule;

    @Column (name = "´haltungsschwaeche´", nullable = false)
    private Boolean haltungsschwaeche;

    @Column (name = "´wirbelverschleiss´", nullable = false)
    private Boolean wirbelverschleiss;

    @Column (name = "´osteoporose´", nullable = false)
    private Boolean osteoporose;

    @Column (name = "´wirbelverschiebung´", nullable = false)
    private Boolean wirbelverschiebung;

    @Column (name = "´bandscheibenschaden´", nullable = false)
    private Boolean bandscheibenschaden;

    @Column (name = "´skoliose´", nullable = false)
    private Boolean skoliose;

    @Column (name = "´baenderrisse´", nullable = false)
    private Boolean baenderrisse;

    @Column (name = "´knochenbrueche´", nullable = false)
    private Boolean knochenbrueche;

    @Column (name = "´muskelMuskelfaserRisse´", nullable = false)
    private Boolean muskelMuskelfaserRisse;

    @Column (name = "´kreislaufschwaeche´", nullable = false)
    private Boolean kreislaufschaeche;

    @Column (name = "´durchblutungsstoerungen´", nullable = false)
    private Boolean durchblutungsstoerungen;

    @Column (name = "´krampfadernVenenschwaeche´", nullable = false)
    private Boolean krampfadernVenenschwaeche;

    @Column (name = "´herzerkrankungen´", nullable = false)
    private Boolean herzerkrankungen;

    @Column (name = "´nicotinkonsum´", nullable = false)
    private Boolean nicotinkonsum;

    @Column (name = "´diabetes´", nullable = false)
    private Boolean diabetes;

    @Column (name = "´bluthochdruck´", nullable = false)
    private Boolean bluthochdruck;

    @Column (name = "´cholesterin´", nullable = false)
    private Boolean cholesterin;

    @Column (name = "´schilddrueseUeberUnterfunktion´", nullable = false)
    private Boolean schilddrueseUeberUnterfunktion;

    @Column (name = "´allergien´", nullable = false)
    private Boolean allergien;

    @Column (name = "´medikamente´", nullable = false)
    private Boolean medikamente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAkuteBeschwerden() {
        return akuteBeschwerden;
    }

    public void setAkuteBeschwerden(String akuteBeschwerden) {
        this.akuteBeschwerden = akuteBeschwerden;
    }

    public String getHauptBeschwerden() {
        return hauptBeschwerden;
    }

    public void setHauptBeschwerden(String hauptBeschwerden) {
        this.hauptBeschwerden = hauptBeschwerden;
    }

    public Boolean isKopfHals() {
        return kopfHals;
    }

    public void setKopfHals(Boolean kopfHals) {
        this.kopfHals = kopfHals;
    }

    public Boolean isSchulter() {
        return schulter;
    }

    public void setSchulter(Boolean schulter) {
        this.schulter = schulter;
    }

    public Boolean isHandEllenbogenArm() {
        return handEllenbogenArm;
    }

    public void setHandEllenbogenArm(Boolean handEllenbogenArm) {
        this.handEllenbogenArm = handEllenbogenArm;
    }

    public Boolean isBeckenHuefte() {
        return beckenHuefte;
    }

    public void setBeckenHuefte(Boolean beckenHuefte) {
        this.beckenHuefte = beckenHuefte;
    }

    public Boolean isOberschenkelKnie() {
        return oberschenkelKnie;
    }

    public void setOberschenkelKnie(Boolean oberschenkelKnie) {
        this.oberschenkelKnie = oberschenkelKnie;
    }

    public Boolean isUnterschenkelFuss() {
        return unterschenkelFuss;
    }

    public void setUnterschenkelFuss(Boolean unterschenkelFuss) {
        this.unterschenkelFuss = unterschenkelFuss;
    }

    public Boolean isHalsWirbelSaeule() {
        return halsWirbelSaeule;
    }

    public void setHalsWirbelSaeule(Boolean halsWirbelSaeule) {
        this.halsWirbelSaeule = halsWirbelSaeule;
    }

    public Boolean isBrustWirbelSaeule() {
        return brustWirbelSaeule;
    }

    public void setBrustWirbelSaeule(Boolean brustWirbelSaeule) {
        this.brustWirbelSaeule = brustWirbelSaeule;
    }

    public Boolean isLendenWirbelSaeule() {
        return lendenWirbelSaeule;
    }

    public void setLendenWirbelSaeule(Boolean lendenWirbelSaeule) {
        this.lendenWirbelSaeule = lendenWirbelSaeule;
    }

    public Boolean isHaltungsschwaeche() {
        return haltungsschwaeche;
    }

    public void setHaltungsschwaeche(Boolean haltungsschwaeche) {
        this.haltungsschwaeche = haltungsschwaeche;
    }

    public Boolean isWirbelverschleiss() {
        return wirbelverschleiss;
    }

    public void setWirbelverschleiss(Boolean wirbelverschleiss) {
        this.wirbelverschleiss = wirbelverschleiss;
    }

    public Boolean isOsteoporose() {
        return osteoporose;
    }

    public void setOsteoporose(Boolean osteoporose) {
        this.osteoporose = osteoporose;
    }

    public Boolean isWirbelverschiebung() {
        return wirbelverschiebung;
    }

    public void setWirbelverschiebung(Boolean wirbelverschiebung) {
        this.wirbelverschiebung = wirbelverschiebung;
    }

    public Boolean isBandscheibenschaden() {
        return bandscheibenschaden;
    }

    public void setBandscheibenschaden(Boolean bandscheibenschaden) {
        this.bandscheibenschaden = bandscheibenschaden;
    }

    public Boolean isSkoliose() {
        return skoliose;
    }

    public void setSkoliose(Boolean skoliose) {
        this.skoliose = skoliose;
    }

    public Boolean isBaenderrisse() {
        return baenderrisse;
    }

    public void setBaenderrisse(Boolean baenderrisse) {
        this.baenderrisse = baenderrisse;
    }

    public Boolean isKnochenbrueche() {
        return knochenbrueche;
    }

    public void setKnochenbrueche(Boolean knochenbrueche) {
        this.knochenbrueche = knochenbrueche;
    }

    public Boolean isMuskelMuskelfaserRisse() {
        return muskelMuskelfaserRisse;
    }

    public void setMuskelMuskelfaserRisse(Boolean muskelMuskelfaserRisse) {
        this.muskelMuskelfaserRisse = muskelMuskelfaserRisse;
    }

    public Boolean isKreislaufschaeche() {
        return kreislaufschaeche;
    }

    public void setKreislaufschaeche(Boolean kreislaufschaeche) {
        this.kreislaufschaeche = kreislaufschaeche;
    }

    public Boolean isDurchblutungsstoerungen() {
        return durchblutungsstoerungen;
    }

    public void setDurchblutungsstoerungen(Boolean durchblutungsstoerungen) {
        this.durchblutungsstoerungen = durchblutungsstoerungen;
    }

    public Boolean isKrampfadernVenenschwaeche() {
        return krampfadernVenenschwaeche;
    }

    public void setKrampfadernVenenschwaeche(Boolean krampfadernVenenschwaeche) {
        this.krampfadernVenenschwaeche = krampfadernVenenschwaeche;
    }

    public Boolean isHerzerkrankungen() {
        return herzerkrankungen;
    }

    public void setHerzerkrankungen(Boolean herzerkrankungen) {
        this.herzerkrankungen = herzerkrankungen;
    }

    public Boolean isNicotinkonsum() {
        return nicotinkonsum;
    }

    public void setNicotinkonsum(Boolean nicotinkonsum) {
        this.nicotinkonsum = nicotinkonsum;
    }

    public Boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean isBluthochdruck() {
        return bluthochdruck;
    }

    public void setBluthochdruck(Boolean bluthochdruck) {
        this.bluthochdruck = bluthochdruck;
    }

    public Boolean isCholesterin() {
        return cholesterin;
    }

    public void setCholesterin(Boolean cholesterin) {
        this.cholesterin = cholesterin;
    }

    public Boolean isSchilddrueseUeberUnterfunktion() {
        return schilddrueseUeberUnterfunktion;
    }

    public void setSchilddrueseUeberUnterfunktion(Boolean schilddrueseUeberUnterfunktion) {
        this.schilddrueseUeberUnterfunktion = schilddrueseUeberUnterfunktion;
    }

    public Boolean isAllergien() {
        return allergien;
    }

    public void setAllergien(Boolean allergien) {
        this.allergien = allergien;
    }

    public Boolean isMedikamente() {
        return medikamente;
    }

    public void setMedikamente(Boolean medikamente) {
        this.medikamente = medikamente;
    }
}
