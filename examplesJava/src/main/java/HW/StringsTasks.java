package HW;



public class StringsTasks {




    //4.1    целого числа в строку
    //**********************************
    public String CeloeToString(int i) {
        String stroka = String.valueOf(i);
        return stroka;
    }

    //**********************************
    //4.2 вещественного числа в строку
    //**********************************
    public String VeshestvennoeToString(int i) {
        if (i < 1) throw new IllegalArgumentException("ArgumentNullException");
        String stroka = String.valueOf(i);
        return stroka;
    }

    //**********************************
    //4.3 строки в целое число
    //**********************************
    public int StrokaInZeloe(String s) {
        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        int a = Integer.getInteger(s);
        return a;
    }

    //**********************************
    //4.4 строки в вещественное число
    //**********************************
    public int StrokaInVeshestvennoe(String s) {
        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        int a = Integer.parseInt(s);
        return a;
    }

    //**********************************
    // 4.5 Дана строка, состоящая из слов, разделенных пробелами и знаками препинания. Определить длину самого короткого слова.
    //**********************************
    public static int SamoeKorotkoeSlovo(String s) {

        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        int shortS = 10000;
        String[] wordS = {};
//        String[] znakiPrepinaniya = {"/.", ",", "?", "!", ":", ";", "(", ")", "'", "\"" };

       s = s.replaceAll("[.,\"?!:;()']", "");
       s = s.replace(" -", "");
//       for (int i = 0; i <znakiPrepinaniya.length; i++) {
//            s.re(znakiPrepinaniya[i], "");
//        }
          wordS = s.split(" ");

        for (int i = 0; i < wordS.length; i++)
        {
           if (wordS[i].length() < shortS && wordS[i].length() != 0)
           {
               shortS = wordS[i].length();
           }
        }
        return shortS;
    }


    //*************************
    //4.6 Подсчитать количество слов во введенной пользователем строке.
    //*******************************************
    public int ChisloSlov(String s)
    {
        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s == "") throw new IllegalArgumentException("ArgumentException");
        int nWords = 0;
        String[] words = { };

        s = s.trim();
        words = s.split(" "); // разбить строки по разделителю  в массив строк

        nWords = words.length;

        return nWords;
    }

    //*************************
    //4.7 В заданной строке удалить последнее слово
    //*******************************************
    public static String DeleteLastWord(String s)
    {
        if (s == null) throw new NullPointerException("ArgumentNullException");
        if (s.equals("")) throw new IllegalArgumentException("ArgumentException");

        String[] words = s.trim().split(" "); // разбить строки по разделителю  в массив строк
        s = "";
        for (int i = 0; i<words.length-1;i++)
        {
            s+=(words[i]+" ");
        }

        return s;
    }

    public static void main(String[] args) {

        System.out.println(SamoeKorotkoeSlovo("Ypa - kk dobr-aya, st\"r\"ochka . Aga, llao koda err?" )  );
    }
}

