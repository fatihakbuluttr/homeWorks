import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
         /* 5.SORU ->>> 1 araba 100km de 9 litre benzin yakıyor. 1 Litre benzin 1.4 euro dur. Kullanıcıdan konsola kaç Euro luv
    benzin alacagini isteyiniz ve onunla kaç km gidebileceğini hesaplayarak konsola yazdiriniz.

     */
        Scanner scan = new Scanner(System.in);

        System.out.print("Kac Euroluk benzin alacaksiniz: ");

        double a = scan.nextDouble();
        double b=(a/1.4)*(100/9);
        System.out.print("Alinan Benzinle:"+b+"km yol gdebilirsiniz");
    }
}
