package HW;
public class Loops {


    	//**********************************************
    	// 2.1 ¬ычислить факториал числа n. n! = 1*2*Е*n-1*n;!
    	//**********************************************
        public int FuctorialN(int n) throws IllegalArgumentException
        {

        if (n < 0) throw new IllegalArgumentException();

        int n_fuc = 1;

            for (int i = 1; i <= n; i++)
            {
                n_fuc = n_fuc * i;
            }
            return n_fuc;
        }
    

    
    	//**********************************************
    	// 2.2	¬ывести число, которое €вл€етс€ зеркальным отображением последовательности цифр заданного числа, например, задано число 123, вывести 321.
    	//**********************************************
        public int MirrorN(int n) throws IllegalArgumentException
        {
        if (n < 0) throw new IllegalArgumentException();
        int revers_n = 0;
            while (n > 0)
            {
                revers_n = revers_n * 10 + n % 10;
                n = n / 10;
            }
            return revers_n;
        }
    

	
	
}
