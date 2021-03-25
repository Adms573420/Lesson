package access;

public class Cember extends BaseClass {
    int yarıcap;

    public Cember(int yarıcap) {
        this.yarıcap = yarıcap;
    }

    @Override
    public int AlanHesapla() {
        int cemberAlan=3*yarıcap*yarıcap;
        return cemberAlan;
    }

    @Override
    public int CevreHesapla() {
       int cemberCevre=2*3*yarıcap;
       return cemberCevre;
    }
}
