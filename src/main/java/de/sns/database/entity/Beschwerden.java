package de.sns.database.entity;

import javax.persistence.*;

@Entity
@Table (name = "`Beschwerden`")
public class Beschwerden {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "akuteBeschwerden", nullable = false)
    private String akuteBeschwerden;

    @Column (name = "hauptBeschwerden", nullable = false)
    private String hauptBeschwerden;

    @Column (name = "kopfHals", nullable = false)
    private boolean kopfHals;

    @Column (name = "schulter", nullable = false)
    private boolean schulter;

    @Column (name = "handEllenbogenArm", nullable = false)
    private boolean handEllenbogenArm;

    @Column (name = "beckenHuefte", nullable = false)
    private boolean beckenHuefte;

    @Column (name = "oberschenkelKnie", nullable = false)
    private boolean oberschenkelKnie;

    @Column (name = "unterschenkelFuss", nullable = false)
    private boolean unterschenkelFuss;

    @Column (name = "halsWirbelSaeule", nullable = false)
    private boolean halsWirbelSaeule;

    @Column (name = "brustWirbelSaeule", nullable = false)
    private boolean brustWirbelSaeule;

    @Column (name = "lendenWirbelSaeule", nullable = false)
    private boolean lendenWirbelSaeule;

    @Column (name = "haltungsschwaeche", nullable = false)
    private boolean haltungsschwaeche;

    @Column (name = "wirbelverschleiss", nullable = false)
    private boolean wirbelverschleiss;

    @Column (name = "osteoporose", nullable = false)
    private boolean osteoporose;

    @Column (name = "wirbelverschiebung", nullable = false)
    private boolean wirbelverschiebung;

    @Column (name = "bandscheibenschaden", nullable = false)
    private boolean bandscheibenschaden;

    @Column (name = "skoliose", nullable = false)
    private boolean skoliose;

    @Column (name = "baenderrisse", nullable = false)
    private boolean baenderrisse;

    @Column (name = "knochenbrueche", nullable = false)
    private boolean knochenbrueche;

    @Column (name = "muskelMuskelfaserRisse", nullable = false)
    private boolean muskelMuskelfaserRisse;

    @Column (name = "kreislaufschwaeche", nullable = false)
    private boolean kreislaufschaeche;

    @Column (name = "durchblutungsstoerungen", nullable = false)
    private boolean durchblutungsstoerungen;

    @Column (name = "krampfadernVenenschwaeche", nullable = false)
    private boolean krampfadernVenenschwaeche;

    @Column (name = "herzerkrankungen", nullable = false)
    private boolean herzerkrankungen;

    @Column (name = "nicotinkonsum", nullable = false)
    private boolean nicotinkonsum;

    @Column (name = "diabetes", nullable = false)
    private boolean diabetes;

    @Column (name = "bluthochdruck", nullable = false)
    private boolean bluthochdruck;

    @Column (name = "cholesterin", nullable = false)
    private boolean cholesterin;

    @Column (name = "schilddrueseUeberUnterfunktion", nullable = false)
    private boolean schilddrueseUeberUnterfunktion;

    @Column (name = "allergien", nullable = false)
    private boolean allergien;

    @Column (name = "medikamente", nullable = false)
    private boolean medikamente;

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

    public boolean isKopfHals() {
        return kopfHals;
    }

    public void setKopfHals(boolean kopfHals) {
        this.kopfHals = kopfHals;
    }

    public boolean isSchulter() {
        return schulter;
    }

    public void setSchulter(boolean schulter) {
        this.schulter = schulter;
    }

    public boolean isHandEllenbogenArm() {
        return handEllenbogenArm;
    }

    public void setHandEllenbogenArm(boolean handEllenbogenArm) {
        this.handEllenbogenArm = handEllenbogenArm;
    }

    public boolean isBeckenHuefte() {
        return beckenHuefte;
    }

    public void setBeckenHuefte(boolean beckenHuefte) {
        this.beckenHuefte = beckenHuefte;
    }

    public boolean isOberschenkelKnie() {
        return oberschenkelKnie;
    }

    public void setOberschenkelKnie(boolean oberschenkelKnie) {
        this.oberschenkelKnie = oberschenkelKnie;
    }

    public boolean isUnterschenkelFuss() {
        return unterschenkelFuss;
    }

    public void setUnterschenkelFuss(boolean unterschenkelFuss) {
        this.unterschenkelFuss = unterschenkelFuss;
    }

    public boolean isHalsWirbelSaeule() {
        return halsWirbelSaeule;
    }

    public void setHalsWirbelSaeule(boolean halsWirbelSaeule) {
        this.halsWirbelSaeule = halsWirbelSaeule;
    }

    public boolean isBrustWirbelSaeule() {
        return brustWirbelSaeule;
    }

    public void setBrustWirbelSaeule(boolean brustWirbelSaeule) {
        this.brustWirbelSaeule = brustWirbelSaeule;
    }

    public boolean isLendenWirbelSaeule() {
        return lendenWirbelSaeule;
    }

    public void setLendenWirbelSaeule(boolean lendenWirbelSaeule) {
        this.lendenWirbelSaeule = lendenWirbelSaeule;
    }

    public boolean isHaltungsschwaeche() {
        return haltungsschwaeche;
    }

    public void setHaltungsschwaeche(boolean haltungsschwaeche) {
        this.haltungsschwaeche = haltungsschwaeche;
    }

    public boolean isWirbelverschleiss() {
        return wirbelverschleiss;
    }

    public void setWirbelverschleiss(boolean wirbelverschleiss) {
        this.wirbelverschleiss = wirbelverschleiss;
    }

    public boolean isOsteoporose() {
        return osteoporose;
    }

    public void setOsteoporose(boolean osteoporose) {
        this.osteoporose = osteoporose;
    }

    public boolean isWirbelverschiebung() {
        return wirbelverschiebung;
    }

    public void setWirbelverschiebung(boolean wirbelverschiebung) {
        this.wirbelverschiebung = wirbelverschiebung;
    }

    public boolean isBandscheibenschaden() {
        return bandscheibenschaden;
    }

    public void setBandscheibenschaden(boolean bandscheibenschaden) {
        this.bandscheibenschaden = bandscheibenschaden;
    }

    public boolean isSkoliose() {
        return skoliose;
    }

    public void setSkoliose(boolean skoliose) {
        this.skoliose = skoliose;
    }

    public boolean isBaenderrisse() {
        return baenderrisse;
    }

    public void setBaenderrisse(boolean baenderrisse) {
        this.baenderrisse = baenderrisse;
    }

    public boolean isKnochenbrueche() {
        return knochenbrueche;
    }

    public void setKnochenbrueche(boolean knochenbrueche) {
        this.knochenbrueche = knochenbrueche;
    }

    public boolean isMuskelMuskelfaserRisse() {
        return muskelMuskelfaserRisse;
    }

    public void setMuskelMuskelfaserRisse(boolean muskelMuskelfaserRisse) {
        this.muskelMuskelfaserRisse = muskelMuskelfaserRisse;
    }

    public boolean isKreislaufschaeche() {
        return kreislaufschaeche;
    }

    public void setKreislaufschaeche(boolean kreislaufschaeche) {
        this.kreislaufschaeche = kreislaufschaeche;
    }

    public boolean isDurchblutungsstoerungen() {
        return durchblutungsstoerungen;
    }

    public void setDurchblutungsstoerungen(boolean durchblutungsstoerungen) {
        this.durchblutungsstoerungen = durchblutungsstoerungen;
    }

    public boolean isKrampfadernVenenschwaeche() {
        return krampfadernVenenschwaeche;
    }

    public void setKrampfadernVenenschwaeche(boolean krampfadernVenenschwaeche) {
        this.krampfadernVenenschwaeche = krampfadernVenenschwaeche;
    }

    public boolean isHerzerkrankungen() {
        return herzerkrankungen;
    }

    public void setHerzerkrankungen(boolean herzerkrankungen) {
        this.herzerkrankungen = herzerkrankungen;
    }

    public boolean isNicotinkonsum() {
        return nicotinkonsum;
    }

    public void setNicotinkonsum(boolean nicotinkonsum) {
        this.nicotinkonsum = nicotinkonsum;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isBluthochdruck() {
        return bluthochdruck;
    }

    public void setBluthochdruck(boolean bluthochdruck) {
        this.bluthochdruck = bluthochdruck;
    }

    public boolean isCholesterin() {
        return cholesterin;
    }

    public void setCholesterin(boolean cholesterin) {
        this.cholesterin = cholesterin;
    }

    public boolean isSchilddrueseUeberUnterfunktion() {
        return schilddrueseUeberUnterfunktion;
    }

    public void setSchilddrueseUeberUnterfunktion(boolean schilddrueseUeberUnterfunktion) {
        this.schilddrueseUeberUnterfunktion = schilddrueseUeberUnterfunktion;
    }

    public boolean isAllergien() {
        return allergien;
    }

    public void setAllergien(boolean allergien) {
        this.allergien = allergien;
    }

    public boolean isMedikamente() {
        return medikamente;
    }

    public void setMedikamente(boolean medikamente) {
        this.medikamente = medikamente;
    }
}
