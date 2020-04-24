import java.util.*;
public class UVA10019 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		while(N-- > 0)
		{
			int Case = sc.nextInt();
			String Case2 = Integer.toString(Case);
			System.out.println(base2(Case)+" "+base16(Case2));
		}
	}
	static int base2(int Case)
	{
		int count = 0;
		while(Case > 0)
		{
			if(Case % 2 == 1)
			{
				count++;
			}
			Case = Case / 2;
		}
		return count;
		
	}
	static int base16(String Case2)
	{
		int count = 0;
		int dec =Integer.parseInt(Case2,16);
		while(dec > 0)
		{
			if(dec % 2 == 1)
			{
				count++;
			}
			dec = dec / 2;
		}
		return count;
	}
}
