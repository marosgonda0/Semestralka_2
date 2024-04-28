package fri.uniza.sk.hraci;

import fri.uniza.sk.objekty.karty.Karta;

import java.util.ArrayList;

public abstract class Hrac {
    private ArrayList<Karta> kartyNaRuke;

    public Hrac() {
        this.kartyNaRuke = new ArrayList<>();
    }

    public void pridajKartu(Karta karta) {
        this.kartyNaRuke.add(karta);
    }

    public void vyhodKarty(int pocetKariet) {
    }
}
