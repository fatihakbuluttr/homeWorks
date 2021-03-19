import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        /* 1.SORU ->>> Konsola sırasıyla 2 sayı giriniz ve birinci sayının ikinci sayıya bolumunden kalanı konsola yazdiriniz.

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");

        int birinci = scan.nextInt();

        System.out.print("ikinci sayiyi giriniz: ");
        int ikinci = scan.nextInt();

        int kalan = birinci % ikinci;

        System.out.println("kalan:" + kalan);

    }
}
