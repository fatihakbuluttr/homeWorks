package AlanÇevre;

public class Cember extends BaseClass{

    double yaricap;

    public Cember(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public int alan() {
        double cember_alan=3.14*yaricap*yaricap;
        int cember_alan_int= (int) cember_alan;
        return cember_alan_int;
    }

    @Override
    public int cevre() {
        double cember_cevre=2*3.14*yaricap;
        int cember_cevre_int= (int) cember_cevre;
        return cember_cevre_int;
    }
}

