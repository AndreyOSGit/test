package start;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class PeredachaZnacheniyVMetod
{

    public static void main(String[] args) {

        int a = 10;
        String str = "abc";
        int[] ar = new int[10];
        ar[0]=10;

        funcVar(a);
        System.out.println(a);
        funcArray(ar);
        System.out.println(ar[0]);
        funcString(str);
        System.out.println(str);


    }
    public static void funcVar(int a)
    {
        a=15;
        System.out.println(a);
    }
    public static void funcArray(int[] ar)
    {
        ar[0] = 15;
        System.out.println(ar[0]);
    }
    public static void funcString(String str)
    {
        str = "cba";
        System.out.println(str);
    }



}



