package Human;

public class Man extends Human {
    public Man(String name, double height, double weight, int age, String gender) {
        super(name, height, weight, age, gender);
    }

    @Override
    public void speak() {
        System.out.println("Hello, Man here");
    }
}