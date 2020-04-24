import java.util.*;
public class UVA11332
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String s = sc.next();
			
			int F[] = new int[10];
			
			for(int i=0;i<s.length();i++)
			{
				F[i] = s.charAt(i)-48;
			}
			
			
			int sum = 0;
			for(int p:F)
				sum += p;
			
			
			while(sum >= 10)
			{
				int x = sum%10;
				int y = sum/10;
				sum = x+y;
			}
			
			
			System.out.println(sum);
		}
	}
}
//1999999999