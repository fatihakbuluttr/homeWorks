package MathUtils;

public class MathUtils {
private int sayi1;
private int sayi2;
private int sayi3;

    public int karesiniAl(int sayi1){
        int karesiniHesapla=sayi1*sayi1;
        return karesiniHesapla;
    }

    public  int sayiyiBesIleCarp(int sayi1){
        int BesIleCarp=5*sayi1;
        return BesIleCarp;
    }

    public int ortalamasiniAl(int sayi1,int sayi2,int sayi3){
        int ortalamaHesapla=(sayi1+sayi2+sayi3)/3;
        return ortalamaHesapla;
    }
}
