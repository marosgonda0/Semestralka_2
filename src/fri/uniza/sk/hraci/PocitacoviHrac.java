package fri.uniza.sk.hraci;

import fri.uniza.sk.objekty.BalicekKariet;
import fri.uniza.sk.objekty.karty.Karta;

import java.util.ArrayList;

public class PocitacoviHrac extends Hrac {
    public PocitacoviHrac() {
        super();
    }

    @Override
    public ArrayList<Karta> hraj(Karta kartaNaVrchuBalicka, BalicekKariet balicekKariet) {
        ArrayList<Karta> kartyNaVylozenie = new ArrayList<>();
        for (Karta karta : this.getKartyNaRuke()) {
            try {
                if (karta.getFarba().equals(kartaNaVrchuBalicka.getFarba()) || karta.getZnak().equals(kartaNaVrchuBalicka.getZnak())) {
                    kartyNaVylozenie.add(karta);
                    System.out.println("Hráč " + this + " vyložil kartu " + karta.getFarba() + " " + karta.getZnak());
                    this.getKartyNaRuke().remove(karta);
                    return kartyNaVylozenie;
                }
            } catch (NullPointerException e) {
                kartyNaVylozenie.add(karta);
                System.out.println("Hráč " + this + " vyložil kartu " + karta.getFarba() + " " + karta.getZnak());
                this.getKartyNaRuke().remove(karta);
                return kartyNaVylozenie;
            }
        }
        this.zoberSiKartu(balicekKariet);
        System.out.println("Hráč " + this + " si vzal kartu");
        return kartyNaVylozenie;
    }
}
