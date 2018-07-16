package start;

public class PrevedenieTipov
{
    public static void main(String[] args) {

        try {
            Integer i1 = new Integer("20349");
            System.out.println(i1);

        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        try {
            Float f1 = new Float("123.5");
            System.out.println(f1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);

        float a = 3.46f;
        String strA = Float.toString(i);
        System.out.println(strA);

        double d = 3.14;
        int p = (int) d;
        System.out.println(p);


    }
}
