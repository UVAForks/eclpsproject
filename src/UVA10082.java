import java.util.*;
public class UVA10082
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String key = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		boolean Mul = true;
		while(sc.hasNextLine())
		{
			if(!Mul)
			{
				System.out.println();
			}
			else
			{
				Mul = false;
			}
			String str = sc.nextLine();
			String kk = key.toUpperCase();
			char k[] = kk.toCharArray();
			char s[] = str.toCharArray();
			
			for(int i=0;i<s.length;i++)
			{
				for(int j=0;j<k.length;j++)
				{
					if(s[i] == ' ')
					{
						System.out.print(" ");
						break;
					}
					if(s[i] == k[j])
					{
						try
						{
							System.out.print(k[j-1]);
						}
						catch(ArrayIndexOutOfBoundsException e)
						{
							System.out.print("/");
						}
					}
				}
			}
			
		}
		System.out.println("");
		
	}
}
