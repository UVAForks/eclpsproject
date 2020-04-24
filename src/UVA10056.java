import  java.util.*;
public class UVA10056
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-- >= 0)
		{
			int m = sc.nextInt();
			double p = sc.nextDouble();
			int k = sc.nextInt();
			double q = 1-p;
			double s = 0;
			if(p==0)
			{
				s = 0.0;
			}
			else
			{
				s = Math.pow(q,(double)k-1)*p/(1-Math.pow(q,(double)m));
			}
			System.out.printf("%.4f\r\n", s);
		}
	}
}
