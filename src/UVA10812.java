import java.util.*;
public class UVA10812
{
	public static void main(String [] args)
	{
		Scanner sc= new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases > 0)
		{
			int s = sc.nextInt();
			int d = sc.nextInt();
			
			if(d > s)
			{
				System.out.println("impossible");
			}
			else if((s+d)%2!=0)
			{
				System.out.println("impossible");
			}
			else
			{
				int  a = (s-d)/2;
				int b = s-a;
				if(a > b)
				{
					System.out.println(a+" "+b);
				}
				else
				{
					System.out.println(b+" "+a);
				}
			}
			cases--;
		}
	}
}
