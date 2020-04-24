import java.util.*;
public class UVA100
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt())
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = 0;
			if(a> b)
			{
				tmp = a;
				a= b;
				b = tmp;//a < b
				System.out.println(b+" "+a+" "+print(a,b));
			}
			else if(a < b)
			{
				System.out.println(a+" "+b+" "+print(a,b));
			}
			else
			{
				System.out.println(a+" "+b+" "+SIZE_VALUE(a));
			}
		}
	}
	static int print(int a,int b)
	{
		int x = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.clear();
		for(int i=a;i<=b;i++)
		{
			list.add(SIZE_VALUE(i));
		}
		if(list.size()!=0)
		{
			x = Collections.max(list);
		}
		else
		{
			x = 0;
		}
		return x;
	}
	static int SIZE_VALUE(int x)
	{
		int size = 0;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(x);
		while(x != 1 )
		{
			if(x%2!=0)
			{
				x = x*3+1;
				list.add(x);
			}
			else
			{
				x = x/2;
				list.add(x);
			}
		}
		size = list.size();
		return size;
	}
}
//737959¡P737960