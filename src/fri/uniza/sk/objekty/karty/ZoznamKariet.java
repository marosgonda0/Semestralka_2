package fri.uniza.sk.objekty.karty;

public enum ZoznamKariet {
    SEDMA_CERVEN("sedma", "cerven", "Resources/obrazkyKariet/sedma_cerven.png"),
    SEDMA_ZELEN("sedma", "zelen", "Resources/obrazkyKariet/sedma_zelen.png"),
    SEDMA_ZALUD("sedma", "zalud", "Resources/obrazkyKariet/sedma_zalud.png"),
    SEDMA_GULA("sedma", "gula", "Resources/obrazkyKariet/sedma_gula.png"),
    OSMICKA_CERVEN("osmicka", "cerven", "Resources/obrazkyKariet/osmicka_cerven.png"),
    OSMICKA_ZELEN("osmicka", "zelen", "Resources/obrazkyKariet/osmicka_zelen.png"),
    OSMICKA_ZALUD("osmicka", "zalud", "Resources/obrazkyKariet/osmicka_zalud.png"),
    OSMICKA_GULA("osmicka", "gula", "Resources/obrazkyKariet/osmicka_gula.png"),
    DEVIATKA_CERVEN("deviatka", "cerven", "Resources/obrazkyKariet/deviatka_cerven.png"),
    DEVIATKA_ZELEN("deviatka", "zelen", "Resources/obrazkyKariet/deviatka_zelen.png"),
    DEVIATKA_ZALUD("deviatka", "zalud", "Resources/obrazkyKariet/deviatka_zalud.png"),
    DEVIATKA_GULA("deviatka", "gula", "Resources/obrazkyKariet/deviatka_gula.png"),
    DESIATKA_CERVEN("desiatka", "cerven", "Resources/obrazkyKariet/desiatka_cerven.png"),
    DESIATKA_ZELEN("desiatka", "zelen", "Resources/obrazkyKariet/desiatka_zelen.png"),
    DESIATKA_ZALUD("desiatka", "zalud", "Resources/obrazkyKariet/desiatka_zalud.png"),
    DESIATKA_GULA("desiatka", "gula", "Resources/obrazkyKariet/desiatka_gula.png"),
    DOLNIK_CERVEN("dolnik", "cerven", "Resources/obrazkyKariet/dolnik_cerven.png"),
    DOLNIK_ZELEN("dolnik", "zelen", "Resources/obrazkyKariet/dolnik_zelen.png"),
    DOLNIK_ZALUD("dolnik", "zalud", "Resources/obrazkyKariet/dolnik_zalud.png"),
    DOLNIK_GULA("dolnik", "gula", "Resources/obrazkyKariet/dolnik_gula.png"),
    HORNIK_CERVEN("hornik", "cerven", "Resources/obrazkyKariet/hornik_cerven.png"),
    HORNIK_ZELEN("hornik", "zelen", "Resources/obrazkyKariet/hornik_zelen.png"),
    HORNIK_ZALUD("hornik", "zalud", "Resources/obrazkyKariet/hornik_zalud.png"),
    HORNIK_GULA("hornik", "gula", "Resources/obrazkyKariet/hornik_gula.png"),
    KRAL_CERVEN("kral", "cerven", "Resources/obrazkyKariet/kral_cerven.png"),
    KRAL_ZELEN("kral", "zelen", "Resources/obrazkyKariet/kral_zelen.png"),
    KRAL_ZALUD("kral", "zalud", "Resources/obrazkyKariet/kral_zalud.png"),
    KRAL_GULA("kral", "gula", "Resources/obrazkyKariet/kral_gula.png"),
    ESO_CERVEN("eso", "cerven", "Resources/obrazkyKariet/eso_cerven.png"),
    ESO_ZELEN("eso", "zelen", "Resources/obrazkyKariet/eso_zelen.png"),
    ESO_ZALUD("eso", "zalud", "Resources/obrazkyKariet/eso_zalud.png"),
    ESO_GULA("eso", "gula", "Resources/obrazkyKariet/eso_gula.png");

    private final String znak;
    private final String farba;
    private final String obrazok;

    ZoznamKariet(String znak, String farba, String obrazok) {
        this.znak = znak;
        this.farba = farba;
        this.obrazok = obrazok;
    }

    public String getZnak() {
        return this.znak;
    }

    public String getFarba() {
        return this.farba;
    }

    public String getObrazok() {
        return this.obrazok;
    }
}
