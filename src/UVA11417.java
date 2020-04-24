import java.util.*;
class UVA11417
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int N = sc.nextInt();
			if(N == 0)
			{
				break;
			}
			int G = 0;
			for(int i=1;i<N;i++)
			{
				for(int j = i+1;j<=N;j++)
				{
					G+=GCD(i,j);
				}
			}
			System.out.println(G);
		}
	}
	static int GCD(int i,int j)//輾轉相除法
	{
		while(j != 0)
		{
			int tmp = i%j;
			i = j;
			j = tmp;
		}
		return i;
	}
}
