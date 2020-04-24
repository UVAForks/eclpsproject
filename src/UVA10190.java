import java.util.*;
class UVA10190
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,m,ok,i,count;
		int a[] = new int[1000];
		
		while(sc.hasNext())
		{
			n = sc.nextInt();
			m = sc.nextInt();
			
			
			count = 0;
			a[0] = n;
			
			if(n>=m && m>=2)
			{
				ok = 1;
			}
			else
			{
				ok = 0;
			}
			
			while(ok != 0 && n>1)
			{
				if(n%m!=0)
				{
					ok = 0;
				}
				else
				{
					n /=m;
					count++;
					a[count]=n;
				}
			}
			
			if(ok == 1)
			{
				for(i = 0;i<count;i++)
				{
					System.out.printf("%d ",a[i]);
				}
				System.out.printf("%d\r\n",a[count]);
			}
			else
			{
				System.out.printf("Boring!\r\n");
			}
		}
	}
}