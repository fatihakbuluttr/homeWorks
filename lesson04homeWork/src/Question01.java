public class Question01 {
    public static void main(String[] args) {
        String a="JAVA Kursu";

        int b=a.indexOf("r");

        System.out.println("r harfi indexi:"+b);

        System.out.println("--------------------------");

        String word="Hello";
        String word2="hello";
        System.out.println("Hello ve hello eşit mi:"+word.equals(word2));

        System.out.println("--------------------------");

        String bb="Elma";
        String bc="Armut";
        String bd="Ceviz";


        boolean aa=bb.contains("a");
        boolean ab=bc.contains("a");
        boolean ac=bd.contains("a");


        System.out.println("Elma a harfini içerirmi:"+aa);
        System.out.println("Armut a harfini içerirmi:"+ab);
        System.out.println("Ceviz a harfini içerirmi:"+ac);


        System.out.println("--------------------------");
    }
}
