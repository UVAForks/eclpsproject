import java.util.*;
class UVA10782
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		int N = 0;
		while(cases > 0 )
		{
			N++;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = 0;
			for(int i=a;i<=b;i++)
			{
				if(i%2!=0)
				{
					sum += i;
				}
			}
			System.out.printf("Case %d: %d",N,sum);
			System.out.println("");
			cases--;
		}
	}
}