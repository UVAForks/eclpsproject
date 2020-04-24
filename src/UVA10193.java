import java.util.*;
public class UVA10193
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = 0;
		try
		{
			while(N-- >= 0)
			{
				C++;
				String b1 = sc.next();
				String b2 = sc.next();
				
				int m = tobase(b1);
				int n = tobase(b2);
				
				int max = 1;
				
				max = gcd(m, n);
				
				if(max == 1)
				{
					System.out.printf("Pair #%d: Love is not all you need!\r\n",C);
				}
				else
				{
					System.out.printf("Pair #%d: All you need is love!\r\n",C);
				}

			}
		}
		catch(Exception e)
		{
			System.out.print(" ");
		}
		
	}
	static int tobase(String s)
	{
		int ans = 0;
		char c[] = s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='\0')
			{
				break;
			}
			ans *=2;
			if(c[i]=='1')
				ans+=1;
		}
		return ans;
	}
	
	
	static int gcd(int b1, int b2)
	{
		if(b2 == 0)
			return b1;
		else
			return gcd(b2, b1%b2);
	}
}
