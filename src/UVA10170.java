import java.util.*;
public class UVA10170 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong())
		{
			long S  = sc.nextLong();
			long D = sc.nextLong();
			long area = 0;
			
			
			for(int i=0;;i++)
			{
				area =(S+(S+i))*(i+1)/2;
				if(area >= D)
				{
					System.out.println(S+i);
					break;
				}
			}
			
		}
	}
}
