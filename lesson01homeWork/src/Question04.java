import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        /* 4.SORU ->>> Konsola 3 sayı yazdiriniz ve en büyükle en kucugun farkini bulunuz

         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");

        int a = scan.nextInt();

        System.out.print("ikinci sayiyi giriniz: ");
        int b = scan.nextInt();

        System.out.print("ucuncu sayiyi giriniz: ");
        int c = scan.nextInt();

        int max_v=Math.max(a,b);
        max_v=Math.max(max_v,c);

        int min_v=Math.min(a,b);
        min_v=Math.min(min_v,c);

        int fark=max_v-min_v;

        System.out.println("Max ve min sayıları farkı:"+fark);
    }
}
