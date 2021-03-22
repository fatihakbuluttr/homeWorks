package AlanÇevre;

public class Kare extends BaseClass{

    int birinci_kenar;

    public Kare(int birinci_kenar) {
        this.birinci_kenar = birinci_kenar;
    }
    @Override
    public int alan() {
       int kare_alan=birinci_kenar*birinci_kenar;
       return kare_alan;
    }

    @Override
    public int cevre() {
        int kare_cevre=4*birinci_kenar;
        return kare_cevre;
    }


}
