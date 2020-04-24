import java.util.*;
public class UVA10550 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int s  = sc.nextInt();
			int a  = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(s+a+b+c == 0)
			{
				break;
			}
			int ans = 720;
			ans += ((40+s-a)%40)*9 ;
			ans += 360;
			ans += ((40+b-a)%40)*9;
			ans += ((40+b-c)%40)*9;
			System.out.println(ans);
		}
	}
}
