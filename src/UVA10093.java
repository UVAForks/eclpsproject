import java.util.Scanner;
public class UVA10093
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine())
		{
			String str = sc.nextLine();
			char c[] = str.toCharArray();
			
			int sum=0;
			int max=1;
			for(char temp: c)
			{
				int R = 0;
				if(temp >=48 && temp<=57)//0-9
				{
					R = temp-48;
				}
				else if(temp >= 65 && temp <= 90)//A-Z
				{
					R = temp - 55;
				}
				else if(temp >= 97 && temp <=122)//a-z
				{
					R = temp - 61;
				}
				sum = sum + R;
				if(R > max)
					max = R;
			}
			
			for(int i=max;i<=62;i++)
			{
				if(i==62)
				{
					System.out.println("such number is impossible!");
					break;
				}
				if(sum % i == 0)
				{
					System.out.println(i + 1);
					break;
				}
			}
		}
	}
}
