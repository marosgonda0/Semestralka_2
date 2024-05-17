package fri.uniza.sk.hlavne;

import java.util.ArrayList;

import fri.uniza.sk.hraci.Hrac;
import fri.uniza.sk.hraci.LudskyHrac;
import fri.uniza.sk.hraci.PocitacoviHrac;
import fri.uniza.sk.objekty.karty.Karta;

public class Hra {
    private Hrac[] hraci;

    public Hra(int pocetHracov ) {
        if (pocetHracov < 2 || pocetHracov > 4) {
            throw new IllegalArgumentException("Hra musí mať 2 až 4 hráčov.");
        }
        this.hraci = new Hrac[pocetHracov];
        this.pridajHracov();
    }

    public void pridajHracov() {
        this.hraci[0] = new LudskyHrac();
        for (int i = 1; i < this.hraci.length; i++) {
            this.hraci[i] = new PocitacoviHrac();
        }
    }



}
