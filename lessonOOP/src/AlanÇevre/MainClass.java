package AlanÇevre;

public class MainClass {
    public static void main(String[] args) {
        Cember cember=new Cember();
        Kare kare=new Kare();
        Dikdortgen dikdortgen=new Dikdortgen();


        System.out.println("Çemberin Çevresi: " +(cember.cevre(5,0)) );
        System.out.println("Dairenin Alan: " + (cember.alan(5,0)));

        System.out.println("--------------------------");

        System.out.println("Karenin Çevresi: " +(kare.cevre(5,5)) );
        System.out.println("Karenin Alan: " + (kare.alan(5,5)));

        System.out.println("--------------------------");

        System.out.println("Dikdörtgenin Çevresi: " +(dikdortgen.cevre(5,10)) );
        System.out.println("Dikdörtgenin Alan: " + (dikdortgen.alan(5,10)));

    }
}
