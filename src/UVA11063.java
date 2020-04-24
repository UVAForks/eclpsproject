import java.util.*;
public class UVA11063
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = 0;
		while(sc.hasNextInt())
		{
			cases++;
			int N = sc.nextInt();
			boolean Mul = false;
			
			
			int t[] = new int[N];
			boolean sum[] = new boolean[20001];
			
			
			int current = 0;
			for(int i=0;i<N;i++)
			{
				t[i] = sc.nextInt();
				if(t[i] <= current || t[i] < 1)
				{
					Mul = true;
				}
				current = t[i];
			}
		
			if(!Mul)
			{
				for(int i=0;!Mul && i<N;i++)
				{
					for(int j=i;!Mul && j<N;j++)
					{
						int add = t[i]+t[j];
						if(!sum[add])
							sum[add] = true;
						else
							Mul = true;
					}
				}
			}
			
			
			if (Mul)
				System.out.printf("Case #%d: It is not a B2-Sequence.\r\n",cases);
			else
				System.out.printf("Case #%d:  It is a B2-Sequence.\r\n",cases);
			
			System.out.println();
			
		}
	}
}
