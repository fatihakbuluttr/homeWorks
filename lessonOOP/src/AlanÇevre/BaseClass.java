package AlanÇevre;

public class BaseClass {
    private double kenarUzunluk;
    private double digerKenar;

    public double cevre(double kenarUzunluk,double digerKenar) {

        double cevreHesapla = 4 * kenarUzunluk;
        return cevreHesapla;

    }

    public double alan(double kenarUzunluk,double digerKenar) {
        double alanHesapla = kenarUzunluk * kenarUzunluk;
        return alanHesapla;
    }
}
