import java.util.*;
public class p11677 
{	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		while(sc.hasNextInt())
		{
			
			int H1 = sc.nextInt();
			int M1 = sc.nextInt();
			int H2 = sc.nextInt();
			int M2 =sc.nextInt();
			int answer = 0;
			if(H1+M1+H2+M2 == 0)
			{
				break;
			}
			
			if(H2 == 0)
			{
				H2 = 24;
			}
			int t1 = H1*60+M1;
			int t2 = H2*60+M2;
			
			if(t1 > t2)
			{
				answer = 1440-(t1 - t2);
			}
			else
			{
				answer = t2 - t1;
			}
			System.out.println(answer);
		}
	}
}
