import P.T;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("Беня", 1, "Мопс");


//        moveAnimal(new Fish());
//        dog1.getName();
//
//        dog1.setAge(17);
//
//        System.out.println(dog1.toString());
//
//
//        System.out.println(Dog.v);
//        Fish fish = new Fish();
//        fish.login();


//        if(dog1.equals(new Dog("Тузик", 2 , "Такса"))){
//            System.out.println("объекты равны");
//        } else {
//            System.out.println("объекты не равны");
//        }

//        B b = new B();
//        b.msg();


        //неправильное копирование массива
//        int xx[] = {1, 4, 5, 2};
//        int yy[] = xx;
        //кривой вывод
//        System.out.println("xx[] -> " + xx);

        //толковый вывод
//        System.out.println("xx[] -> " + Arrays.toString(xx));
        //сортировка
//        Arrays.sort(xx);
//        System.out.println("xx[] -> " + Arrays.toString(xx));
//        //видно что yy это просто ссылка на объект, те коппирование int yy[] = xx; кривое.
//        // это просто коппирование ссылки на объект
//        System.out.println("yy[] -> " + Arrays.toString(yy));
//
//        int zz[] = new int[xx.length];

//        //корректный копи
//        for (int i = 0; i < xx.length; i++) {
//            zz[i] = xx[i];
//        }
//
//                System.out.println("zz[] -> " + Arrays.toString(zz));

//        //можно корректно скопить и так
//        System.arraycopy(xx, 0, zz, 0, xx.length);
//        System.out.println("zz[] -> " + Arrays.toString(zz));
//        zz[1] = 6;
//        zz[2] = 9;
//        System.out.println("xx[] -> " + Arrays.toString(xx));
//        System.out.println("zz[] -> " + Arrays.toString(zz));
//
//
//        //сортировка массива пузырьком
//        //https://vertex-academy.com/tutorials/ru/sortirovka-puzyrkom-v-java/
//        int[] mas = {11, 3, 14, 16, 7};
//        boolean isSorted = false;
//        int buf;
//        while (!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length - 1; i++) {
//                if (mas[i] < mas[i + 1]) {
//                    isSorted = false;
//                    buf = mas[i];
//                    mas[i] = mas[i + 1];
//                    mas[i + 1] = buf;
//                }
//            }
//        }
//        System.out.println("mas[] -> " + Arrays.toString(mas));

//        List<String> stringList = new ArrayList<>();
//        stringList.add("Vasya");
//        stringList.add("Petya");
//        stringList.add("Olya");

//        for (String s : stringList
//                ) {
//            if (s.equals("Vasya")) {
//                stringList.remove(s);
//            }
//        }

//        Iterator<String> iter = stringList.iterator();
//        while (iter.hasNext()) {
//            String next = iter.next();
//            if (next.contains("Vasya"))
//                iter.remove();
//        }

//        System.out.println(stringList.size());
//        System.out.println(stringList.get(2));
//        System.out.println(stringList.contains("Olya"));
//        System.out.println(stringList.isEmpty());

//        System.out.println(stringList.toString());
//        Collections.sort(stringList);
//        System.out.println(stringList.toString());

//        Map<Integer, String> map = new HashMap<>();
//
//        map.put(1, "Ulya");
//        map.put(2, "Vitaha");
//        map.put(3, "Volodya");

//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("key -> = " + key);
//            System.out.println("value -> = " + value);
//        }

//        System.out.println(map.get(2));
//
//        Set<String> set = new HashSet<>();
//        set.add("Ulya");
//        set.add("Ulya");
//        set.add("Vitaha");

//        for (String s : set) {
//            System.out.println(s);
//        }

        try{
            opop();
        }catch (ArithmeticException e){
            System.out.println("деление на ноль");
        }


//        set.stream().forEach(s -> System.out.println(s));
//        set.forEach(s -> System.out.println(s));
//        set.stream().forEach(System.out::println);
//        set.forEach(System.out::println);


//        msgFromMain(new B());
//        msgFromMain(new C());



//        msgFromI(new B());

//        System.out.println(B.staticS);

//        P.T t = new T();

//        String s = smtToString(10);
//        String s = smtToString(10.5);

//        int x = stringToInt("1");

//        System.out.println("Hello world");

        //        taskOne();
//        System.out.println(taskTwo(3));
//        System.out.println(taskTwoTwo(123));
    }
    public static void opop() throws ArithmeticException
    {
        System.out.println(42/0);
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }

    public static void printMsg(String s) {
        System.out.println(s);
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static void msgFromMain(A a) {
        a.msg();
    }

    public static void msgFromI(I i) {
        i.msgFromI();
    }

    public static void taskOne() {
        int a = 10;
        int b = 4;
        int c = 5;

        if (a % 2 == 0) {
            System.out.println(a * b / c);
        }
        if ((a + c) % 2 == 0 || (b + c) % 2 == 0) {
            System.out.println("op");
            System.out.println(Math.pow(a, c));
        } else {
            System.out.println(a + b + c);
        }
    }

    public static int taskTwo(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int taskTwoTwo(int x) {
        int res = 0;
        while (x != 0) {
            System.out.println("res = " + res);
            res = res * 10 + x % 10;
            x /= 10;
            System.out.println("res = " + res + "; x = " + x);
        }
        //модуль числа
        res = Math.abs(res);
        return res;
    }

    /**
     * сортировка пузырьком
     * https://vertex-academy.com/tutorials/ru/sortirovka-puzyrkom-v-java/
     */

    /**
     * int hlen = arr.length /2;
     * int cpos = hlen + arr.length % 2;
     * for (int i = 0; i < hlen; i++) {
     * int t = arr[i];
     * arr[i] = arr[cpos + i];
     * arr[cpos + i] = t;
     * }
     */

    //перегрузка метода
    public static String smtToString(int x) {
        return String.valueOf(x);
    }

    public static String smtToString(double x) {
        return String.valueOf(x);
    }

    public static int stringToInt(String s) {
        return Integer.parseInt(s);
    }
}
