package HW;
public class ConditionalOperators 
{


	public static void main(String[] args) {
		System.out.println( Chet(4,0,0) );
	}

	public static double Chet(int a, int b, int c)
	{
		double d = 0;
		if (Math.abs(a) % 2 == 0 )
		{
			d = a*b/c;
		}
		else
		{
			d = a + b - c;
		}
		if ( Math.abs(a+c)%2 == 0 || Math.abs(b+c)%2 == 0 )
		{
			d = Math.pow(a,c);
		}
		else
		{
			d = a + b - c;
		}
		return d;
	}


	public int oblasty3D( int x, int y, int z) throws IllegalArgumentException
	{
		int oblasty = 0;
		if (x > 0 && y > 0 && z > 0)
		{
			oblasty = 1;
		}
		else if (x > 0 && y > 0 && z < 0)
		{
			oblasty = 2 ;
		}
		else if (x < 0 && y > 0 && z < 0)
		{
			oblasty = 3;
		}
		else if (x < 0 && y > 0 && z > 0)
		{
			oblasty = 4;
		}
		else if (x > 0 && y < 0 && z > 0)
		{
			oblasty = 5;
		}
		else if (x > 0 && y < 0 && z < 0)
		{
			oblasty = 6;
		}
		else if (x < 0 && y < 0 && z < 0)
		{
			oblasty = 7;
		}
		else if (x < 0 && y < 0 && z > 0)
		{
			oblasty = 8;
		}
		else
		{
			throw new IllegalArgumentException ();
		}
		return oblasty;
	}


}


