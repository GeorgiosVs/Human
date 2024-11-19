package Human;

public class Woman extends Human {
    public Woman(String name, double height, double weight, int age) {
        super(name, height, weight, age);
        setGender("Woman");
    }

    @Override
    public void speak() {
        System.out.println("Hello, Woman here");
    }
}