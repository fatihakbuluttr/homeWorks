package Ice;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        IceCream ice1 = new IceCream("Chocolate", 13);
        IceCream ice2 = new IceCream("Vanilla", 60);
        IceCream ice3 = new IceCream("Strawberry", 97);
        IceCream ice4 = new IceCream("Plain", 18);
        IceCream ice5 = new IceCream("ChocolateChip", 3);
        IceCream[] array1 = {ice1, ice2, ice3, ice4, ice5};
        IceCream[] array2 = {ice3, ice5};
        sweetestIceCream(array2);
    }
    private static void sweetestIceCream(IceCream[] iceCreamArray) {
        int[] arraySweetness = new int[iceCreamArray.length];
        for (int i = 0; i < iceCreamArray.length; i++) {
            arraySweetness[i] = iceCreamArray[i].getValue();
        }
        Arrays.sort(arraySweetness);
        System.out.println(arraySweetness[arraySweetness.length - 1]);
    }
}
