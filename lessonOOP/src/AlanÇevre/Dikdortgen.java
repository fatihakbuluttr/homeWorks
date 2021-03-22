package AlanÇevre;

public class Dikdortgen extends BaseClass {
   int birinci_kenar;
   int ikinci_kenar;

    public Dikdortgen(int birinci_kenar, int ikinci_kenar) {
        this.birinci_kenar = birinci_kenar;
        this.ikinci_kenar = ikinci_kenar;
    }

    @Override
    public int alan() {
       int dikdortgen_alan=birinci_kenar*ikinci_kenar;
       return dikdortgen_alan;
    }

    @Override
    public int cevre() {
        int dikdortgen_cevre=2*(birinci_kenar+ikinci_kenar);
        return dikdortgen_cevre;
    }
}



