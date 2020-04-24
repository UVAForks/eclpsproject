import java.util.*;
public class UVA11678 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0)
			{
				break;
			}
			int a[] = new int[m];
			int b[] = new int[n];
			
			for(int i=0;i < m;i++)
			{
				a[i] = sc.nextInt();
				if(i > 0 && a[i] == a[i - 1])
				{
					a[i - 1] = 0;
				}
			}
			
			for(int i=0;i < n;i++)
			{
				b[i] = sc.nextInt();
				if(i > 0 && b[i] == b[i - 1])
				{
					b[i - 1] = 0;
				}
			}
			
			for(int i = 0, j = 0;i < m && j < n;)
			{
				if(a[i] == b[j])
				{
					a[i] = 0;
					b[j] = 0;
					i++;
					j++;
				}
				else
				{
					if(a[i] < b[j])
					{
						i++;
					}
					else
					{
						j++;
					}
				}
			}
			int an = 0;
			int bn = 0;
			for(int i=0;i<m;i++)
			{
				if(a[i] > 0)
				{
					an++;
				}
			}
			for(int i=0;i<n;i++)
			{
				if(b[i] > 0)
				{
					bn++;
				}
			}
			System.out.println((an > bn)?bn : an);
		}
	}
}
