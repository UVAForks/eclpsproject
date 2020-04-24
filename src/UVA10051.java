import java.util.*;
public class UVA10051 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLong())
		{
			System.out.println(Math.abs(sc.nextLong()-sc.nextLong()));
		}
	}
}
