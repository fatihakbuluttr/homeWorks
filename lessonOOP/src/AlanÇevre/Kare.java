package AlanÇevre;

public class Kare extends BaseClass{

    @Override
    public double alan(double kenarUzunluk, double digerKenar) {
        double alanHesapla=digerKenar*kenarUzunluk;
        return alanHesapla;
    }

    @Override
    public double cevre(double kenarUzunluk, double digerKenar) {
        double cevreHesapla=4*kenarUzunluk;
        return cevreHesapla;
    }
}
