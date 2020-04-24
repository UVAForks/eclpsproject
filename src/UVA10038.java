import java.util.*;
public class UVA10038
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int cases = sc.nextInt();
			int N[] = new int[cases];
			for(int i=0;i<N.length;i++)
			{
				N[i] = sc.nextInt();
			}
			
			boolean flag = true;
			if(cases != 1)
			{
				int arrD[] = new int[cases-1];
				for(int i=0;i<N.length-1;i++)
				{
					arrD[i] = Math.abs(N[i]-N[i+1]);
				}
				
				Arrays.sort(arrD);
				
				for(int i=0;i<arrD.length;i++)
				{
					if(arrD[i]!=i+1)
					{
						flag=false;
						break;
					}
				}
			}
			
			if(flag) System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}
