package Human;
public class Human {
    private String name;
    private double height;
    private double weight;
    private int age;
    private String gender;

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

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void printDetails() {
        System.out.println(name + " is a " + gender);
        System.out.println("Gender: " + getGender() +
                ", Name: " + name +
                ", Height: " + height +
                ", Weight: " + weight +
                ", Age: " + age);
    }

    public void speak() {
        System.out.println("Hello this is Human");
    }
}