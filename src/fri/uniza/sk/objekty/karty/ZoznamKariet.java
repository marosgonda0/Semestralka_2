package fri.uniza.sk.objekty.karty;

public enum ZoznamKariet {
    SEDMA_CERVEN("sedma", "cerven", "obrazkyKariet/sedma_cerven.png"),
    SEDMA_ZELEN("sedma", "zelen", "obrazkyKariet/sedma_zelen.png"),
    SEDMA_ZALUD("sedma", "zalud", "obrazkyKariet/sedma_zalud.png"),
    SEDMA_GULA("sedma", "gula", "obrazkyKariet/sedma_gula.png"),
    OSMICKA_CERVEN("osmicka", "cerven", "obrazkyKariet/osmicka_cerven.png"),
    OSMICKA_ZELEN("osmicka", "zelen", "obrazkyKariet/osmicka_zelen.png"),
    OSMICKA_ZALUD("osmicka", "zalud", "obrazkyKariet/osmicka_zalud.png"),
    OSMICKA_GULA("osmicka", "gula", "obrazkyKariet/osmicka_gula.png"),
    DEVIATKA_CERVEN("deviatka", "cerven", "obrazkyKariet/deviatka_cerven.png"),
    DEVIATKA_ZELEN("deviatka", "zelen", "obrazkyKariet/deviatka_zelen.png"),
    DEVIATKA_ZALUD("deviatka", "zalud", "obrazkyKariet/deviatka_zalud.png"),
    DEVIATKA_GULA("deviatka", "gula", "obrazkyKariet/deviatka_gula.png"),
    DESIATKA_CERVEN("desiatka", "cerven", "obrazkyKariet/desiatka_cerven.png"),
    DESIATKA_ZELEN("desiatka", "zelen", "obrazkyKariet/desiatka_zelen.png"),
    DESIATKA_ZALUD("desiatka", "zalud", "obrazkyKariet/desiatka_zalud.png"),
    DESIATKA_GULA("desiatka", "gula", "obrazkyKariet/desiatka_gula.png"),
    DOLNIK_CERVEN("dolnik", "cerven", "obrazkyKariet/dolnik_cerven.png"),
    DOLNIK_ZELEN("dolnik", "zelen", "obrazkyKariet/dolnik_zelen.png"),
    DOLNIK_ZALUD("dolnik", "zalud", "obrazkyKariet/dolnik_zalud.png"),
    DOLNIK_GULA("dolnik", "gula", "obrazkyKariet/dolnik_gula.png"),
    HORNIK_CERVEN("hornik", "cerven", "obrazkyKariet/hornik_cerven.png"),
    HORNIK_ZELEN("hornik", "zelen", "obrazkyKariet/hornik_zelen.png"),
    HORNIK_ZALUD("hornik", "zalud", "obrazkyKariet/hornik_zalud.png"),
    HORNIK_GULA("hornik", "gula", "obrazkyKariet/hornik_gula.png"),
    KRAL_CERVEN("kral", "cerven", "obrazkyKariet/kral_cerven.png"),
    KRAL_ZELEN("kral", "zelen", "obrazkyKariet/kral_zelen.png"),
    KRAL_ZALUD("kral", "zalud", "obrazkyKariet/kral_zalud.png"),
    KRAL_GULA("kral", "gula", "obrazkyKariet/kral_gula.png"),
    ESO_CERVEN("eso", "cerven", "obrazkyKariet/eso_cerven.png"),
    ESO_ZELEN("eso", "zelen", "obrazkyKariet/eso_zelen.png"),
    ESO_ZALUD("eso", "zalud", "obrazkyKariet/eso_zalud.png"),
    ESO_GULA("eso", "gula", "obrazkyKariet/eso_gula.png");

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
