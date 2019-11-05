
public class Main {

	public static void main(String[] args) {
        Rabbit rbt = new Rabbit("Peter", false, "Grass", 4, "Grey");
        System.out.printf("Hello, His name is %s%n", rbt.getName());
        System.out.printf("%s is Vegetarian? %b%n", rbt.getName(), rbt.vegetarian);
        System.out.printf("%s eats %s%n", rbt.getName(), rbt.getEats());
        System.out.printf("%s has %d legs%n", rbt.getName(), rbt.getNoOfLegs());
        System.out.printf("%s color is %s%n", rbt.getName(), rbt.getColor());
    }


}
