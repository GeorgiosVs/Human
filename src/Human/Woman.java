package Human;

public class Woman extends Human {
    public Woman(String name, double height, double weight, int age, String gender) {
        super(name, height, weight, age);
        setGender(gender);
    }
}