package access;

public class Kare extends BaseClass {
    int kenar_uzunlugu;

    public Kare(int kenar_uzunlugu) {
        this.kenar_uzunlugu = kenar_uzunlugu;
    }

    @Override
    public int AlanHesapla() {
       int kareAlan=kenar_uzunlugu*kenar_uzunlugu;
       return kareAlan;
    }

    @Override
    public int CevreHesapla() {
       int kareCevre=4*kenar_uzunlugu;
       return kareCevre;
    }
}
