import java.util.*;
public class UVA11636
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int tmp = 0;
		while(sc.hasNextInt())
		{
			tmp++;
			int cases = sc.nextInt();
			if(cases < 0)
			{
				break;
			}
			for(int i=0;i<20;i++)
			{
				if(cases <= Math.pow(2,i))
				{
					System.out.printf("Case %d: %d\n",tmp,i);
					break;
				}
			}
		}
		System.out.print(" ");
	}
}
