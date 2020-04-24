import java.util.*;
public class UVA948 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N > 0)
		{
			int x  = sc.nextInt();
			int a = x;
			int fib[] = new int[39];
			fib[0] = 1;
			fib[1] = 2;
			
			for(int i=2;i<39;i++)
			{
				fib[i] = fib[i-1]+fib[i-2];
			}
				
			int index = 0;
			for(int i=0;i<fib.length;i++)
			{
				if(fib[i] >= x)
				{
					index = i;
					break;
				}
			}
			
			
			System.out.print(a+" = ");
			for(int i=index;i>=0;i--)
			{
				if(x >= fib[i])
				{
					x = x-fib[i];
					System.out.print(1);
				}
				else
				{
					if(i == index)
					{
						System.out.print("");
					}
					else
					{
						System.out.print(0);
					}
				}
			}
			System.out.println(" (fib)");
			
			
			
			//System.out.printf("%d = %d (fib)",a,x);
			
			
			//System.out.print(s);
			//System.out.println(Arrays.toString(ans));
			N--;
		}
	}
}
