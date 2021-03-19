import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
         /*2.SORU ->>> Ucgenin ic acıları toplamı 180dir. Konsola kullanicidan üçgenin 2 acisini sirasiyla isteyiniz ve 3. Acıyı
        hesaplayarak konsola yazdiriniz. Eğer kullanıcın girdiği ilk 2 acinin toplamı 180den büyükse “yanlış aci girildi” uyarısı veriniz.



        */

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci aciyi giriniz: ");

        int a = scan.nextInt();

        System.out.print("ikinci aciyi giriniz: ");
        int b = scan.nextInt();


        int d = (180 - (a + b));

        String sonuc = (d < 0) ? " Yanlis Sayi Deger Girdiniz" : String.valueOf( d);
        System.out.println(" Ucuncu Acinin Degeri.......>  " + sonuc);

        /*int aci_1;
        int aci_2;
        Scanner aci1 = new Scanner(System.in);
        Scanner aci2 = new Scanner(System.in);
        System.out.println(">>>>>Bu program Ucgenin Ic Acilarini Hesaplar<<<<<<");
        System.out.print(" Birinci Aciyi Giriniz......: ");
        aci_1 = aci1.nextInt();
        System.out.print(" Ikinci Aciyi Giriniz.......: ");
        aci_2 = aci2.nextInt();
        int aci_3 = aci_1 + aci_2;
        String sonuc = (aci_3 >= 180) ? " Yanlis Sayi Deger Girdiniz" : String.valueOf(180 - aci_3);
        System.out.println(" Ucuncu Acinin Degeri.......>  " + sonuc);

         */
    }
}
