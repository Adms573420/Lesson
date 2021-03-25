public class faizHesaplama {

 int faiz_tutarı;
 int vade;
 int anapara;
 int faiz_oranı;

    public faizHesaplama() {
    }

  public faizHesaplama(int faiz_tutarı, int vade, int anapara,int faiz_oranı) {
    this.faiz_tutarı = faiz_tutarı;
    this.vade = vade;
    this.anapara = anapara;
    this.faiz_oranı=faiz_oranı;
  }

  public int faiz_tutarı(){

    faiz_tutarı=anapara*vade*faiz_oranı;
    return faiz_tutarı;


    }

    public void setFaiz_tutarı(int faiz_tutarı) {
        this.faiz_tutarı = faiz_tutarı;
    }

    public void setVade(int vade) {
        this.vade = vade;
    }

    public void setAnapara(int anapara) {
        this.anapara = anapara;
    }

    public void setFaiz_oranı(int faiz_oranı) {
        this.faiz_oranı = faiz_oranı;
    }
}



