import java.util.*;
public class UVA10008
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int len = 0;
		int a[] = new int[26];
		while(N-- >=0)
		{
			String str = sc.nextLine().toUpperCase().replaceAll("\\s+","");
			len += str.length();
			//System.out.println(str);
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) >= 65 && str.charAt(i) <= 90)
				{
					a[str.charAt(i)-'A']++;
				}
			}
			//System.out.println(Arrays.toString(a));
		}
		while (len-- > 1) 
		{
			for (int i = 'A'; i <= 'Z'; i++)
				if (a[i-65] == len)
					System.out.println((char)i + " " + len);
		}
	}
}
