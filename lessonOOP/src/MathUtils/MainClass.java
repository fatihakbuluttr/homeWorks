package MathUtils;

public class MainClass {
    public static void main(String[] args) {
        MathUtils islem = new MathUtils();

        System.out.println("Sayının karesi: " + islem.karesiniAl(5));
        System.out.println("Sayıyının beş ile çarpımı : " + islem.sayiyiBesIleCarp(10));
        System.out.println("Üç Sayının ortalaması : " + islem.ortalamasiniAl(5, 6, 10));
    }
}
