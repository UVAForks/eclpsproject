import java.util.*;
public class UVA272
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean Mul = true;
		while(sc.hasNext())
		{
			String str = sc.nextLine();
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == '"')
				{
					if(Mul)
					{
						System.out.print("``");
						Mul = false;
					}
					else
					{
						System.out.print("''");
						Mul = true;
					}
				}
				else
				{
					System.out.print(str.charAt(i));
				}
			}
			System.out.println();
		}
	}
}
