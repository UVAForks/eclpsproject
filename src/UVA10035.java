import java.util.*;
public class UVA10035
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextLong())
		{
			long x = sc.nextLong();
			long y = sc.nextLong();
			if(x+y==0)
			{
				break;
			}
			int count = 0;
			long r = 0;
			int i=0;
			while(x > 0 || y > 0 )
			{
				long tmp = x,tmps = y;
				tmp = tmp%10;
				tmps = tmps%10;
				x = x/10;
				y = y/10;
				long z = tmp+tmps;//12 9
				if(i==0 && z>=10)
				{
					count++;
					r = z/10;
				}
				if(i > 0)
				{
					if(r+z >= 10)
					{
						count++;
						r = (r+z)/10;
					}
					else
					{
						r = 0;
					}
				}
				i++;
				
			}
			if(count == 0)
			{
				System.out.println("No carry operation.");
			}
			else if(count == 1)
			{
				System.out.printf("%d carry operation.\r\n",count);
			}
			else
			{
				System.out.printf("%d carry operations.\r\n",count);
			}
		}
	}
}
