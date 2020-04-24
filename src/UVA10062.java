import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		boolean Mul= true;
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
			
			int arr[]= new int[255];
			int max = 0;
			for(int i=0;i<str.length();i++)
			{
				arr[str.charAt(i)]++;
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i] >max)
				{
					max = arr[i];
				}
			}
			
			for(int i=1;i<=max;i++)
			{
				for(int j=arr.length-1;j>=0;j--)
				{
					if(arr[j] == i)
					{
						System.out.println(j+" "+arr[j]);
					}
				}
			}
		}
	}
}