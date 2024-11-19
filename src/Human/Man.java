package Human;

public class Man extends Human {
    public Man(String name, double height, double weight, int age) {
        super(name, height, weight, age);
        setGender("Male");
    }

    @Override
    public void speak() {
        System.out.println("Hello, Man here");
    }
}