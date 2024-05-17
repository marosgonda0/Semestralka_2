package fri.uniza.sk.objekty.karty;

import fri.shapesge.Obrazok;

public abstract class Karta {
    private String znak;
    private String farba;
    private String obrazok;


    public Karta(String znak, String farba, String obrazok) {
        this.znak = znak;
        this.farba = farba;
        this.obrazok = obrazok;
    }

    public abstract void vykonajAkciu();

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
