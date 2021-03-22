package Computer;

import java.util.ArrayList;
import java.util.Arrays;

/*
ram, islemci ve ekran buyuklugu field lerini
iceren bir Bilgisayar sinifi olusturunuz,
MainClass da 5 adet Bilgisayar nesnesi olusturunuz
bunlari bir array'e yerlestiriniz ve ekran'i 13den
buyuk olanlari yazdiriniz.
 */

public class MainClass {
    public static void main(String[] args) {

        Bilgisayar bilgisayar1 = new Bilgisayar("bilgisayar1",16, "i5", 12);
        Bilgisayar bilgisayar2 = new Bilgisayar("bilgisayar2",8, "i7", 13);
        Bilgisayar bilgisayar3 = new Bilgisayar("bilgisayar3",4, "i3", 14);
        Bilgisayar bilgisayar4 = new Bilgisayar("bilgisayar4",16, "i5", 15);
        Bilgisayar bilgisayar5 = new Bilgisayar("bilgisayar5",16, "i5", 16);

        ArrayList<Bilgisayar> bilgisayarlar=new ArrayList<>();
        bilgisayarlar.add(bilgisayar1);
        bilgisayarlar.add(bilgisayar2);
        bilgisayarlar.add(bilgisayar3);
        bilgisayarlar.add(bilgisayar4);
        bilgisayarlar.add(bilgisayar5);

        for (int i = 0; i < bilgisayarlar.size(); i++) {
            if (bilgisayarlar.get(i).getEkranBuyuklugu() > 13) {
                System.out.println( bilgisayarlar.get(i).getIsim()+"Ekranı 13 ten büyüktür");
            }else {
                System.out.println(bilgisayarlar.get(i).getIsim()+"Ekranı 13 ten küçüktür" );

            }
        }
    }
}
