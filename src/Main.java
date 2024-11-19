import Human.*;

public class Main {
    public static void main(String[] args) {
        Man m = new Man("Alex", 180, 75, 30, "male");
        Woman w = new Woman("Jane", 165, 60, 26, "female");

        m.printDetails();
        w.printDetails();

        System.out.println("Both " + m.name + " and " + w.name + " are humans.");
    }
}