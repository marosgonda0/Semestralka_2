package fri.uniza.sk.objekty;

import fri.uniza.sk.objekty.karty.*;

import java.util.ArrayList;

public class BalicekKariet {
    private ArrayList<Karta> karty;
    private int pocetKariet;

    public BalicekKariet() {
        this.pocetKariet = 32;
        this.karty = new ArrayList<>();
    }

    public void napln() {
        for (ZoznamKariet karta : ZoznamKariet.values()) {
            this.karty.add(new Karta(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
        }
    }

    public void zamiesaj() {
        for (int i = 0; i < this.pocetKariet; i++) {
            int randomIndex = (int)(Math.random() * this.pocetKariet);
            Karta temp = this.karty.get(i);
            this.karty.set(i, this.karty.get(randomIndex));
            this.karty.set(randomIndex, temp);
        }
    }

    public Karta[] dajKarty(int pocetKariet) {
        Karta[] zobraneKarty = new Karta[pocetKariet];
        for (int i = 0; i < pocetKariet; i++) {
            zobraneKarty[i] = this.karty.get(i);
            this.karty.remove(i);
        }
        return zobraneKarty;
    }

    public void vypisKarty() {
        for (int i = 0; i < this.pocetKariet; i++) {
            System.out.println(this.karty.get(i).getZnak() + " " + this.karty.get(i).getFarba());
        }
    }
}
