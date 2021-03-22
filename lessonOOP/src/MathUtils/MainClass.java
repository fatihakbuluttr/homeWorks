package MathUtils;

public class MainClass {

    /*
MathUtils adinda bir sinif olusturunuz ve bu sinifta
karesiniAl, sayiyiBesIleCarp ve girilen 3 sayinin
ortalamasiniAl metotlari olusturunuz, bu metotlari
MainClass da nesne olusturmadan kullaniniz.
 */

    public static void main(String[] args) {

        int kareAl = MathUtils.karesiniAl(5);
        System.out.println("Sayının karesi: " + kareAl);

        int besleCarp=MathUtils.sayiyiBesIleCarp(6);
        System.out.println("Sayıyının beş ile çarpımı : " + besleCarp);

        double ortalama=MathUtils.ortalamasiniAl(10,15,20);
        System.out.println("Üç Sayının ortalaması : " + ortalama);


    }
}
