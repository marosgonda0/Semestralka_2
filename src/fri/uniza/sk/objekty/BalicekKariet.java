package fri.uniza.sk.objekty;

import fri.uniza.sk.objekty.karty.*;

import java.util.ArrayList;

public class BalicekKariet {
    private ArrayList<Karta> karty;

    public BalicekKariet() {
        this.karty = new ArrayList<>();
    }

    public void napln() {
        for (ZoznamKariet karta : ZoznamKariet.values()) {
            switch (karta.getZnak()) {
                case "hornik":
                    this.karty.add(new Hornik(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    break;
                case "sedma":
                    if (karta.getFarba().equals("cerven")) {
                        this.karty.add(new SedmaCerven(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    } else {
                        this.karty.add(new Sedma(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    }
                    break;
                case "dolnik":
                    if (karta.getFarba().equals("zelen")) {
                        this.karty.add(new DolnikZelen(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    } else {
                        this.karty.add(new ObycajnaKarta(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    }
                    break;
                case "eso":
                    this.karty.add(new Eso(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    break;
                default:
                    this.karty.add(new ObycajnaKarta(karta.getZnak(), karta.getFarba(), karta.getObrazok()));
                    break;
            }
        }
    }

    public void zamiesaj() {
        for (int i = 0; i < this.karty.size(); i++) {
            int randomIndex = (int)(Math.random() * this.karty.size());
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
        for (int i = 0; i < this.karty.size(); i++) {
            System.out.println(this.karty.get(i).getZnak() + " " + this.karty.get(i).getFarba());
        }
    }

    public Karta dajKartu() {
        Karta karta = this.karty.get(0);
        this.karty.remove(0);
        return karta;
    }
}
