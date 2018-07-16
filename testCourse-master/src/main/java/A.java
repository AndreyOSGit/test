public abstract class A {

    String s = "Привет, я поле класса A";

    public A() {
        //обычно в абстракт классе конструктор пустой
//        System.out.println("Привет, я конструктор класса A");
    }

    public void msg() {
        System.out.println("Я метод msg класса А");
    }
}
