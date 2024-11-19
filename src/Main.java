import Human.Human;
import Human.Man;
import Human.Woman;

public class Main {
    public static void main(String[] args) {
        Man m = new Man("Alex", 180, 75, 30);
        Woman w = new Woman("Jane", 165, 60, 26);
        Human h = new Human();

        m.printDetails();
        w.printDetails();

        m.speak();
        w.speak();
        h.speak();

        System.out.println("Both " + m.getName() + " and " + w.getName() + " are humans.");
        System.out.println(m.getName() + " is a human: " + (m instanceof Human));
        System.out.println(w.getName() + " is a human: " + (w instanceof Human));
    }
}