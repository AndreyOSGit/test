import java.util.Objects;

public class Dog extends Animal {

    static int v = 10;
    private String name;
    private int age;
    String poroda = "Мопс";

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public Dog(String name, int age, String poroda) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("я пес, я двигаюсь");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(poroda, dog.poroda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, poroda);
    }
}
