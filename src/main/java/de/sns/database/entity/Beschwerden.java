package de.sns.database.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.*;

@Entity
@Table (name = "`Beschwerden`")
public class Beschwerden {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "`akuteBeschwerden`", nullable = false)
    private String akuteBeschwerden;

    @Column (name = "`hauptBeschwerden`", nullable = false)
    private String hauptBeschwerden;

    @Column (name = "`kopfHals`", nullable = false)
    private Boolean kopfHals;

    @Column (name = "`schulter`", nullable = false)
    private Boolean schulter;

    @Column (name = "`handEllenbogenArm`", nullable = false)
    private Boolean handEllenbogenArm;

    @Column (name = "`beckenHuefte`", nullable = false)
    private Boolean beckenHuefte;

    @Column (name = "`oberschenkelKnie`", nullable = false)
    private Boolean oberschenkelKnie;

    @Column (name = "`unterschenkelFuss`", nullable = false)
    private Boolean unterschenkelFuss;

    @Column (name = "`halsWirbelSaeule`", nullable = false)
    private Boolean halsWirbelSaeule;

    @Column (name = "`brustWirbelSaeule`", nullable = false)
    private Boolean brustWirbelSaeule;

    @Column (name = "`lendenWirbelSaeule`", nullable = false)
    private Boolean lendenWirbelSaeule;

    @Column (name = "`haltungsschwaeche`", nullable = false)
    private Boolean haltungsschwaeche;

    @Column (name = "`wirbelverschleiss`", nullable = false)
    private Boolean wirbelverschleiss;

    @Column (name = "`osteoporose`", nullable = false)
    private Boolean osteoporose;

    @Column (name = "`wirbelverschiebung`", nullable = false)
    private Boolean wirbelverschiebung;

    @Column (name = "`bandscheibenschaden`", nullable = false)
    private Boolean bandscheibenschaden;

    @Column (name = "`skoliose`", nullable = false)
    private Boolean skoliose;

    @Column (name = "`baenderrisse`", nullable = false)
    private Boolean baenderrisse;

    @Column (name = "`knochenbrueche`", nullable = false)
    private Boolean knochenbrueche;

    @Column (name = "`muskelMuskelfaserRisse`", nullable = false)
    private Boolean muskelMuskelfaserRisse;

    @Column (name = "`kreislaufschwaeche`", nullable = false)
    private Boolean kreislaufschaeche;

    @Column (name = "`durchblutungsstoerungen`", nullable = false)
    private Boolean durchblutungsstoerungen;

    @Column (name = "`krampfadernVenenschwaeche`", nullable = false)
    private Boolean krampfadernVenenschwaeche;

    @Column (name = "`herzerkrankungen`", nullable = false)
    private Boolean herzerkrankungen;

    @Column (name = "`nicotinkonsum`", nullable = false)
    private Boolean nicotinkonsum;

    @Column (name = "`diabetes`", nullable = false)
    private Boolean diabetes;

    @Column (name = "`bluthochdruck`", nullable = false)
    private Boolean bluthochdruck;

    @Column (name = "`cholesterin`", nullable = false)
    private Boolean cholesterin;

    @Column (name = "`schilddrueseUeberUnterfunktion`", nullable = false)
    private Boolean schilddrueseUeberUnterfunktion;

    @Column (name = "`allergien`", nullable = false)
    private Boolean allergien;

    @Column (name = "`medikamente`", nullable = false)
    private Boolean medikamente;

    @NotNull
    public Integer getId() {
        return id;
    }

    public void setId(@NotNull Integer id) {
        this.id = id;
    }

    @NotNull
    public String getAkuteBeschwerden() {
        return akuteBeschwerden;
    }

    public void setAkuteBeschwerden(@NotNull String akuteBeschwerden) {
        this.akuteBeschwerden = akuteBeschwerden;
    }

    @NotNull
    public String getHauptBeschwerden() {
        return hauptBeschwerden;
    }

    public void setHauptBeschwerden(@NotNull String hauptBeschwerden) {
        this.hauptBeschwerden = hauptBeschwerden;
    }

    @NotNull
    public Boolean isKopfHals() {
        return kopfHals;
    }

    public void setKopfHals(@NotNull Boolean kopfHals) {
        this.kopfHals = kopfHals;
    }

    @NotNull
    public Boolean isSchulter() {
        return schulter;
    }

    public void setSchulter(@NotNull Boolean schulter) {
        this.schulter = schulter;
    }

    @NotNull
    public Boolean isHandEllenbogenArm() {
        return handEllenbogenArm;
    }

    public void setHandEllenbogenArm(@NotNull Boolean handEllenbogenArm) {
        this.handEllenbogenArm = handEllenbogenArm;
    }

    @NotNull
    public Boolean isBeckenHuefte() {
        return beckenHuefte;
    }

    public void setBeckenHuefte(@NotNull Boolean beckenHuefte) {
        this.beckenHuefte = beckenHuefte;
    }

    @NotNull
    public Boolean isOberschenkelKnie() {
        return oberschenkelKnie;
    }

    public void setOberschenkelKnie(@NotNull Boolean oberschenkelKnie) {
        this.oberschenkelKnie = oberschenkelKnie;
    }

    @NotNull
    public Boolean isUnterschenkelFuss() {
        return unterschenkelFuss;
    }

    public void setUnterschenkelFuss(@NotNull Boolean unterschenkelFuss) {
        this.unterschenkelFuss = unterschenkelFuss;
    }

    @NotNull
    public Boolean isHalsWirbelSaeule() {
        return halsWirbelSaeule;
    }

    public void setHalsWirbelSaeule(@NotNull Boolean halsWirbelSaeule) {
        this.halsWirbelSaeule = halsWirbelSaeule;
    }

    @NotNull
    public Boolean isBrustWirbelSaeule() {
        return brustWirbelSaeule;
    }

    public void setBrustWirbelSaeule(@NotNull Boolean brustWirbelSaeule) {
        this.brustWirbelSaeule = brustWirbelSaeule;
    }

    @NotNull
    public Boolean isLendenWirbelSaeule() {
        return lendenWirbelSaeule;
    }

    public void setLendenWirbelSaeule(@NotNull Boolean lendenWirbelSaeule) {
        this.lendenWirbelSaeule = lendenWirbelSaeule;
    }

    @NotNull
    public Boolean isHaltungsschwaeche() {
        return haltungsschwaeche;
    }

    public void setHaltungsschwaeche(@NotNull Boolean haltungsschwaeche) {
        this.haltungsschwaeche = haltungsschwaeche;
    }

    @NotNull
    public Boolean isWirbelverschleiss() {
        return wirbelverschleiss;
    }

    public void setWirbelverschleiss(@NotNull Boolean wirbelverschleiss) {
        this.wirbelverschleiss = wirbelverschleiss;
    }

    @NotNull
    public Boolean isOsteoporose() {
        return osteoporose;
    }

    public void setOsteoporose(@NotNull Boolean osteoporose) {
        this.osteoporose = osteoporose;
    }

    @NotNull
    public Boolean isWirbelverschiebung() {
        return wirbelverschiebung;
    }

    public void setWirbelverschiebung(@NotNull Boolean wirbelverschiebung) {
        this.wirbelverschiebung = wirbelverschiebung;
    }

    @NotNull
    public Boolean isBandscheibenschaden() {
        return bandscheibenschaden;
    }

    public void setBandscheibenschaden(@NotNull Boolean bandscheibenschaden) {
        this.bandscheibenschaden = bandscheibenschaden;
    }

    @NotNull
    public Boolean isSkoliose() {
        return skoliose;
    }

    public void setSkoliose(@NotNull Boolean skoliose) {
        this.skoliose = skoliose;
    }

    @NotNull
    public Boolean isBaenderrisse() {
        return baenderrisse;
    }

    public void setBaenderrisse(@NotNull Boolean baenderrisse) {
        this.baenderrisse = baenderrisse;
    }

    @NotNull
    public Boolean isKnochenbrueche() {
        return knochenbrueche;
    }

    public void setKnochenbrueche(@NotNull Boolean knochenbrueche) {
        this.knochenbrueche = knochenbrueche;
    }

    @NotNull
    public Boolean isMuskelMuskelfaserRisse() {
        return muskelMuskelfaserRisse;
    }

    public void setMuskelMuskelfaserRisse(@NotNull Boolean muskelMuskelfaserRisse) {
        this.muskelMuskelfaserRisse = muskelMuskelfaserRisse;
    }

    @NotNull
    public Boolean isKreislaufschaeche() {
        return kreislaufschaeche;
    }

    public void setKreislaufschaeche(@NotNull Boolean kreislaufschaeche) {
        this.kreislaufschaeche = kreislaufschaeche;
    }

    @NotNull
    public Boolean isDurchblutungsstoerungen() {
        return durchblutungsstoerungen;
    }

    public void setDurchblutungsstoerungen(@NotNull Boolean durchblutungsstoerungen) {
        this.durchblutungsstoerungen = durchblutungsstoerungen;
    }

    @NotNull
    public Boolean isKrampfadernVenenschwaeche() {
        return krampfadernVenenschwaeche;
    }

    public void setKrampfadernVenenschwaeche(@NotNull Boolean krampfadernVenenschwaeche) {
        this.krampfadernVenenschwaeche = krampfadernVenenschwaeche;
    }

    @NotNull
    public Boolean isHerzerkrankungen() {
        return herzerkrankungen;
    }

    public void setHerzerkrankungen(@NotNull Boolean herzerkrankungen) {
        this.herzerkrankungen = herzerkrankungen;
    }

    @NotNull
    public Boolean isNicotinkonsum() {
        return nicotinkonsum;
    }

    public void setNicotinkonsum(@NotNull Boolean nicotinkonsum) {
        this.nicotinkonsum = nicotinkonsum;
    }

    @NotNull
    public Boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(@NotNull Boolean diabetes) {
        this.diabetes = diabetes;
    }

    @NotNull
    public Boolean isBluthochdruck() {
        return bluthochdruck;
    }

    public void setBluthochdruck(@NotNull Boolean bluthochdruck) {
        this.bluthochdruck = bluthochdruck;
    }

    @NotNull
    public Boolean isCholesterin() {
        return cholesterin;
    }

    public void setCholesterin(@NotNull Boolean cholesterin) {
        this.cholesterin = cholesterin;
    }

    @NotNull
    public Boolean isSchilddrueseUeberUnterfunktion() {
        return schilddrueseUeberUnterfunktion;
    }

    public void setSchilddrueseUeberUnterfunktion(@NotNull Boolean schilddrueseUeberUnterfunktion) {
        this.schilddrueseUeberUnterfunktion = schilddrueseUeberUnterfunktion;
    }

    @NotNull
    public Boolean isAllergien() {
        return allergien;
    }

    public void setAllergien(@NotNull Boolean allergien) {
        this.allergien = allergien;
    }

    @NotNull
    public Boolean isMedikamente() {
        return medikamente;
    }

    public void setMedikamente(@NotNull Boolean medikamente) {
        this.medikamente = medikamente;
    }
}
