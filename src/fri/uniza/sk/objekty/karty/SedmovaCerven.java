package fri.uniza.sk.objekty.karty;

public class SedmovaCerven extends Karta {
    public SedmovaCerven(String znak, String farba, String obrazok) {
        super(znak, farba, obrazok);
    }

    @Override
    public String getZnak() {
        return "Jou";
    }
}
