package AlanÇevre;

public class Cember extends BaseClass{

    @Override
    public double alan(double kenarUzunluk,double digerKenar) {
        double alanHesapla=3.14*kenarUzunluk*kenarUzunluk;

        return alanHesapla;

    }

    @Override
    public double cevre(double kenarUzunluk, double digerKenar) {
        double cevreHesapla=2*3.14*kenarUzunluk;
        
        return cevreHesapla;
    }
}
