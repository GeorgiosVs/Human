package Human;
public class Human {
    public String name;
    public double height;
    public double weight;
    public int age;
    private String gender;

    public Human(){}

    public Human(String name, double height, double weight, int age, String gender) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void printDetails() {
        System.out.println(name + " is a " + gender);
        System.out.println("Gender: " + getGender() +
            ", Name: " + name +
            ", Age: " + age);
    }
    public void speak() {
        System.out.println("Hello, Human here");
    }
}