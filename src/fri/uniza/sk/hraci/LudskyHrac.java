package fri.uniza.sk.hraci;

import fri.uniza.sk.objekty.BalicekKariet;
import fri.uniza.sk.objekty.karty.Karta;

import java.util.ArrayList;
import java.util.Scanner;

public class LudskyHrac extends Hrac {
    public LudskyHrac() {
        super();
    }

    @Override
    public ArrayList<Karta> hraj(Karta kartaNaVrchuBalicka, BalicekKariet balicekKariet) {
        ArrayList<Karta> kartyNaVylozenie = new ArrayList<>();
        System.out.println("Karty na ruke: ");
        for (int i = 0; i < this.getKartyNaRuke().size(); i++) {
            System.out.println(i + ". " + this.getKartyNaRuke().get(i).getZnak() + " " + this.getKartyNaRuke().get(i).getFarba());
        }
        System.out.println("Vyber kartu na vyloženie: ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            var karta = scanner.next();
            try {
                if (Integer.parseInt(karta) >= 0 && Integer.parseInt(karta) < this.getKartyNaRuke().size()) {
                    kartyNaVylozenie.add(this.getKartyNaRuke().get(Integer.parseInt(karta)));
                    this.getKartyNaRuke().remove(Integer.parseInt(karta));
                }
            } catch (NumberFormatException e) {
                if (karta.equals("z")) {
                    this.zoberSiKartu(balicekKariet);
                    System.out.println("Hráč " + this + " si vzal kartu");
                    return kartyNaVylozenie;
                } else if (karta.equals("v")) {
                    break;
                } else {
                    System.out.println("Zadajte správne číslo karty alebo 'z' pre zobrazenie kariet");
                }
            }

        }

        return kartyNaVylozenie;
    }
}
