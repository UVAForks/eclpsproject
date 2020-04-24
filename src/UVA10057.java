import java.util.*;
public class UVA10057 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int mid,mid2,n_mid,count;
		while(sc.hasNextInt())
		{
			int cases = sc.nextInt();
			int N[] = new int[cases];
			for(int i=0;i<N.length;i++)
			{
				N[i] = sc.nextInt();
			}
			
			Arrays.sort(N);
			
			mid = N[(cases-1)/2];
			mid2 = N[cases/2];
			
			count = 0;
			for(int i=0;i<cases;i++)
			{
				if(N[i] == mid || N[i] == mid2)
				{
					count++;
				}
			}
			
			n_mid = mid2-mid+1;
			
			System.out.println(mid + " " + count + " " + n_mid);	
			
		}
	}
}
