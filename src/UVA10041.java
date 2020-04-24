import java.util.*;
public class UVA10041
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(sc.hasNextInt())
		{
			int x  = sc.nextInt();
			int N[] = new int[x];
			for(int i=0;i<N.length;i++)
			{
				N[i] = sc.nextInt();
			}
			Arrays.sort(N);
			int len = 0;
			for(int i=0;i<x;i++)
			{
				len+=Math.abs(N[i]-N[i/2]);
			}
			System.out.println(len);
		}
	}
}
