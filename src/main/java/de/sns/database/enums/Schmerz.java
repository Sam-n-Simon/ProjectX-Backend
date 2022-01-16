package de.sns.database.enums;

public enum Schmerz {

    KEIN_SCHMERZ(1, "Kein Schmerz"),
    LEICHTER_SCHMERZ(2, "Leichter Schmerz"),
    MITTLERER_SCHMERZ(3, "Mittlerer Schmerz"),
    STARKER_SCHMERZ(4, "Starker Schmerz"),
    SEHR_STARKER_SCHMERZ(5, "Sehr starker Schmerz"),
    STAERKSTER_VORSTELLBARER_SCHMERZ(6, "Stärkster vorstellbarer Schmerz");

    private final int skala;
    private final String bezeichnung;

    Schmerz(int skala, String bezeichnung) {
        this.skala = skala;
        this.bezeichnung = bezeichnung;
    }

    public int getSkala() {
        return skala;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }
}
