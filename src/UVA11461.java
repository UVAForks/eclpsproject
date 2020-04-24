import java.util.*;
class UVA11416
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a+b != 0)
			{
				int count = 0;
				int i=(int)Math.sqrt(a);
				while((int)Math.pow(i,2)<=b)
				{
					if((int)Math.pow(i,2)>=a)
					{
						count++;
					}
					i++;
				}
				System.out.println(count);
			}
			else
			{
				break;
			}
		}
	}
}