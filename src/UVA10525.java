import java.util.*;
public class UVA10525
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{	
			String a = sc.next();
			String b = sc.next();
			int p[] = new int[26];
			int q[] = new int[26];
			
			for(int i=0;i<a.length();i++)
			{
				if(a.charAt(i)>96 && a.charAt(i)<123)
				{
					p[a.charAt(i)-'a']++;
				}
			}
			
			for(int i=0;i<b.length();i++)
			{
				if(b.charAt(i)>96 && b.charAt(i)<123)
				{
					q[b.charAt(i)-'a']++;
				}
			}
			
			for(int i=0;i<26;i++)
			{
				if(p[i] > 0 && q[i]>0)
				{
					if(p[i] > q[i])
					{
						while(q[i] > 0)
						{
							System.out.print((char)(i+'a'));
							q[i]--;
						}
					}
					else
					{
						while(p[i] > 0)
						{
							System.out.print((char)(i+'a'));
							p[i]--;
						}
					}
				}
			}
			
			System.out.println();
			
		}
	}
}
