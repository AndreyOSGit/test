public class C extends A implements I{

    public C() {
        System.out.println("Привет, я конструктор класса C");
    }

    @Override
    public void msg() {
        System.out.println("Я метод msg класса C");
    }

    {

    }

    @Override
    public void msgFromI() {
        System.out.println("Я метод msgFromI класса C");

    }
    //что такое внетренние классы


}
