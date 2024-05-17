package fri.uniza.sk.hlavne;

import fri.uniza.sk.hraci.Hrac;
import fri.uniza.sk.objekty.BalicekKariet;
import fri.uniza.sk.objekty.karty.Karta;

import java.util.ArrayList;

public class Kolo {

    private ArrayList<Karta> polozeneKarty;
    private Hrac[] hraci;
    private BalicekKariet balicekKariet;

    public Kolo(Hrac[] hraci, BalicekKariet balicekKariet) {
        this.polozeneKarty = new ArrayList<>();
        this.balicekKariet = balicekKariet;
    }

    public void rozdajKarty() {
        for (Hrac hrac : this.hraci) {
            hrac.pridajKarty(this.balicekKariet.dajKarty(5));
        }
    }

    public void zahrajKolo() {

    }
}
