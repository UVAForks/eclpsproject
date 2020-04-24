import java.util.*;
public class UVA11541 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i=1;i<=cases;i++)
		{
			String s = sc.next();
			String[] alpha = s.split("[0-9]+");
			String[] digit = s.split("[A-Z]+");
			StringBuffer sb = new StringBuffer();
			for(int j=0;j<alpha.length;j++)
			{
				int count = Integer.parseInt(digit[j+1]);
				for(int k=1;k<=count;k++)
				{
					sb.append(alpha[j]);
				}
			}
			System.out.println("Case "+i+": "+sb.toString());
		}
	}
}
