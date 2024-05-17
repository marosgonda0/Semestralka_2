package fri.uniza.sk.hraci;

import fri.uniza.sk.objekty.BalicekKariet;
import fri.uniza.sk.objekty.karty.Karta;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Hrac {
    private ArrayList<Karta> kartyNaRuke;

    public Hrac() {
        this.kartyNaRuke = new ArrayList<>();
    }

    public void pridajKarty(Karta[] karty) {
        this.kartyNaRuke.addAll(Arrays.asList(karty));
    }

    public abstract ArrayList<Karta> hraj(Karta kartaNaVrchuBalicka, BalicekKariet balicekKariet);

    public ArrayList<Karta> getKartyNaRuke() {
        return this.kartyNaRuke;
    }

    protected void zoberSiKartu(BalicekKariet balicekKariet) {
        this.kartyNaRuke.add(balicekKariet.dajKartu());
    }
}
