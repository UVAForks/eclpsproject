import java.util.*;
public class UVA10101 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(sc.hasNext())
		{
			count++;
			long n = sc.nextLong();
			System.out.printf("%4d",count);
			if(n == 0)
				System.out.print("0");
			else
				divial(n);
			System.out.println();
		}
		//System.out.print(divial(x));
	}
	static  void divial(long n)
	{
		
		if(n >= 10000000)
		{
			divial(n / 10000000);
			System.out.print(" kuti");
			n %= 10000000;
		}
		if( n >= 100000)
		{
			divial(n / 100000);
			System.out.print(" lakh");
			n %= 100000;
		}
		if( n >= 1000)
		{
			divial(n / 1000);
			System.out.print(" hajar");
			n %= 1000;
		}
		if(n >= 100)
		{
			divial(n / 100);
			System.out.print(" shata");
			n %= 100;
		}
		if(n!=0)
		{
			System.out.print(" "+n);
		}
	}
}
//999,999,999,999,999