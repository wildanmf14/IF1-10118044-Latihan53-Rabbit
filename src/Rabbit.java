public class Rabbit extends Animal {

    private final String color;
    private final String name;

    public Rabbit(String name, boolean vegetarian, String eats, int noOfLegs, String color) {

        super(vegetarian, eats, noOfLegs);
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

}
