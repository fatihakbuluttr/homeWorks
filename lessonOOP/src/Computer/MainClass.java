package Computer;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Bilgisayar bilgisayar1 = new Bilgisayar(16, "i5", 12);
        Bilgisayar bilgisayar2 = new Bilgisayar(8, "i7", 13);
        Bilgisayar bilgisayar3 = new Bilgisayar(4, "i3", 14);
        Bilgisayar bilgisayar4 = new Bilgisayar(16, "i5", 15);
        Bilgisayar bilgisayar5 = new Bilgisayar(16, "i5", 16);

        int[] arr = {bilgisayar1.ekranBuyuklugu, bilgisayar2.ekranBuyuklugu, bilgisayar3.ekranBuyuklugu,
                bilgisayar4.ekranBuyuklugu, bilgisayar5.ekranBuyuklugu};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 13) {
                System.out.println("Ekranı 13 ten büyük olan: Bilgisayar" + (i + 1));
            }
        }
    }
}
