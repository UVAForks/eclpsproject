import java.util.*;
public class UVA10222 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s ="`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";

		while(sc.hasNextLine())
		{
			String str = sc.nextLine().toLowerCase();
			
			//System.out.print(str.charAt(2));
			
			for(int i=0;i<str.length();i++)
			{
				if((int)str.charAt(i) == 32)
				{
					System.out.print(" ");
				}
				for(int j=0;j<s.length();j++)
				{
					if(str.charAt(i) == s.charAt(j))
					{
						if(j == 0)
						{
							System.out.print("-");
						}
						else if(j == 1)
						{
							System.out.print("=");
						}
						else
						{
							System.out.print(s.charAt(j-2));
						}
					}
				}
			}
			
			System.out.println("");
			
		}
	}
}
