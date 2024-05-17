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
        this.hraci = hraci;
        this.polozeneKarty = new ArrayList<>();
        this.balicekKariet = balicekKariet;
    }

    public void rozdajKarty() {
        for (Hrac hrac : this.hraci) {
            hrac.pridajKarty(this.balicekKariet.dajKarty(5));
        }
    }

    public void zahrajKolo() {
        Hrac[] poradieHracov = new Hrac[this.hraci.length];
        var pocetDokoncenychHracov = 0;
        while (pocetDokoncenychHracov != this.hraci.length - 1) {
            for (int i = pocetDokoncenychHracov; i < this.hraci.length; i++) {
                if (!this.hraci[i].getKartyNaRuke().isEmpty()) {
                    try {
                        this.polozeneKarty.addAll(this.hraci[i].hraj(this.polozeneKarty.get(this.polozeneKarty.size() - 1), this.balicekKariet));
                    } catch (IndexOutOfBoundsException e) {
                        this.polozeneKarty.addAll(this.hraci[i].hraj(null, this.balicekKariet));
                    }
                }
                if (this.skontrolujVyhruHraca(this.hraci[i])) {
                    poradieHracov[pocetDokoncenychHracov] = this.hraci[i];
                    pocetDokoncenychHracov++;
                }
            }
        }
        for (Hrac hrac : poradieHracov) {
            if (hrac != null) {
                System.out.println("Hráč " + hrac + " vyhral!");
            }
        }
    }

    public boolean skontrolujVyhruHraca(Hrac hrac) {
        return hrac.getKartyNaRuke().isEmpty();
    }
}
