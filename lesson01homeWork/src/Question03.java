import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        /*3.SORU ->>> Ehliyet alma yaşı 18dir. Kullanıcıdan yasini isteyiniz ve ehliyet alıp alamayacagini konsola yazdiriniz.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Yasinizi giriniz: ");

        int a = scan.nextInt();

        boolean c=(a>18);
        System.out.println("ehliyet alabilir mi:"+c);

    }
}
