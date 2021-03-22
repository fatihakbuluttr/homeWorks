package Ice;

public class IceCream {
    private String flavors;
    private int numSprinkles;
    public IceCream(String flavors, int numSprinkles) {
        this.flavors = flavors;
        this.numSprinkles = numSprinkles;
    }
    public int getValue() {
        int sweetnessValue = 0;
        switch (this.flavors) {
            case "Plain":
                sweetnessValue = 0;
                break;
            case "Vanilla":
            case "ChocolateChip":
                sweetnessValue = 5;
                break;
            case "Strawberry":
            case "Chocolate":
                sweetnessValue = 10;
                break;
        }
        return  sweetnessValue + this.numSprinkles;
    }
    public String getFlavors() {
        return flavors;
    }
    public int getNumSprinkles() {
        return numSprinkles;
    }
}
