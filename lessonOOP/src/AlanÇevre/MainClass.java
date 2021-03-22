package AlanÇevre;
/*BaseClass adinda bir sinif olusturunuz
ve bu sinifta alanHesapla ve cevreHesapla
metodlari olusturunuz,
daha sonra BaseClass'i extend eden Cember,
Kare ve Dikdortgen siniflari olusturunuz ve
alanHesapla ve cevreHesapla metotlarini
override ediniz ve MainClass da bu metotlari
kullaniniz.

 */

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        /*Scanner girdi=new Scanner(System.in);
        int kare_kenar=girdi.nextInt();
        System.out.print("Karenin kenarını girin: ");

         */

        Kare myKare=new Kare(5);
        int myKare_alan =myKare.alan();
        int myKare_cevre=myKare.cevre();
        System.out.println("myKare_alan : "+myKare_alan );
        System.out.println("myKare_cevre: "+myKare_cevre);

        Dikdortgen myDikdortgen=new Dikdortgen(4,5);
        int myDikdortgen_alan = myDikdortgen.alan();
        int myDikdortgen_cevre=myDikdortgen.cevre();
        System.out.println("myDikdortgen_alan : "+myDikdortgen_alan );
        System.out.println("myDikdortgen_cevre: "+myDikdortgen_cevre);

        Cember myCember=new Cember(10);
        int myCember_alan =myCember.alan();
        int myCember_cevre=myCember.cevre();
        System.out.println("myCember_alan : "+myCember_alan );
        System.out.println("myCember_cevre: "+myCember_cevre);


    }
}
