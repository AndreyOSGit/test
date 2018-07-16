public class B extends A implements I {

    final String s = "Привет, я поле класса B";

    public B() {
        System.out.println("Привет, я конструктор класса B");
    }

    static String staticS = "Я статическая переменная";

    @Override
    public void msg() {
        super.msg();
        System.out.println("Я метод msg класса B");
        System.out.println(super.s);
        System.out.println(s);
//        System.out.println(s);
    }

    @Override
    public void msgFromI() {
        System.out.println("Я метод msgFromI класса B");

    }

}
