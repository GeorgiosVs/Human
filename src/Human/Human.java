package Human;

class Human {
    public String name;
    public double height;
    public double weight;
    public int age;
    private String gender;

    public Human(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    protected void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void printDetails() {
        System.out.println(name + " is a " + gender);
        System.out.println("Gender: " + getGender() +
                ", Name: " + name +
                ", Height: " + height +
                ", Weight: " + weight +
                ", Age: " + age);
    }
}