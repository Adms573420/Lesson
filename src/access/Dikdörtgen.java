package access;

public class Dikdörtgen extends BaseClass {
    int kısa_kenar;
    int uzun_kenar;

    public Dikdörtgen(int kısa_kenar, int uzun_kenar) {
        this.kısa_kenar = kısa_kenar;
        this.uzun_kenar = uzun_kenar;
    }

    @Override
    public int AlanHesapla() {
        int dikdörtgenAlan=kısa_kenar*uzun_kenar;
        return dikdörtgenAlan;
    }

    @Override
    public int CevreHesapla() {
       int dikdörtgenCevre=2*(kısa_kenar+uzun_kenar);
       return dikdörtgenCevre;
    }
}

