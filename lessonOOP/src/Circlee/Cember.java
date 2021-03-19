package Circlee;

public class Cember {
    private double yariCap;

   /* public double cevre(double yariCap) {

        double cevreHesapla = 2 * 3.14 * yariCap;
        return cevreHesapla;
    }

    public double alan(double yariCap){
        double alanHesapla=3.14*yariCap*yariCap;
        return alanHesapla;

    */
   public void cevre(double yariCap) {

       double cevreHesapla = 2 * 3.14 * yariCap;
       System.out.println("Çemberin çevresi: "+cevreHesapla);


   }

    public void alan(double yariCap){
        double alanHesapla=3.14*yariCap*yariCap;
        System.out.println("Çemberin alanı: "+alanHesapla);
    }
}
