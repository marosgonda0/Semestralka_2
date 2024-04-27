package fri.uniza.sk.objekty;

import fri.uniza.sk.objekty.karty.*;

public class BalicekKariet {
    private Karta[] karty;
    private int pocetKariet;

    public BalicekKariet() {
        this.pocetKariet = 32;
        this.karty = new Karta[this.pocetKariet];
    }

    public void naplnBalik() {
        for (ZoznamKariet karta : ZoznamKariet.values()) {
            if (karta.getZnak().equals("dolnik") && karta.getFarba().equals("zelen")) {
                this.karty[karta.ordinal()] = new ZelenyDolnik(karta.getZnak(), karta.getFarba(), karta.getObrazok());
            }
            if (karta.getZnak().equals("hornik")) {
                this.karty[karta.ordinal()] = new Hornik(karta.getZnak(), karta.getFarba(), karta.getObrazok());
            }
            if (karta.getZnak().equals("sedma")) {
                if (karta.getFarba().equals("cerven")) {
                    this.karty[karta.ordinal()] = new SedmovaCerven(karta.getZnak(), karta.getFarba(), karta.getObrazok());
                } else {
                    this.karty[karta.ordinal()] = new Sedmova(karta.getZnak(), karta.getFarba(), karta.getObrazok());
                }
                this.karty[karta.ordinal()] = new Sedmova(karta.getZnak(), karta.getFarba(), karta.getObrazok());
            } else {
                this.karty[karta.ordinal()] = new ObycajnaKarta(karta.getZnak(), karta.getFarba(), karta.getObrazok());
            }
        }
    }

    public void vypisKarty() {
        for (int i = 0; i < this.pocetKariet; i++) {
            System.out.println(this.karty[i].getZnak() + " " + this.karty[i].getFarba());
        }
    }
}
