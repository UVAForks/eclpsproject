import java.util.*;
public class UVA1583 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int t = 0;
		int ans[] = new int[100010];
		for(int i=1;i<ans.length;i++)
		{
			x = i;
			t = i;
			while(x > 0)
			{
				t += x%10;
				x /= 10;
			}
			if(t <= 100000 && ans[t]==0)
			{
				ans[t] = i;
			}
		}
		int cases = sc.nextInt();
		while(cases > 0)
		{
			int cin = sc.nextInt();
			System.out.println(ans[cin]);
			cases--;
		}
	}
}
/*題意: A = B+(b1+b2+b3)   207 => 207 + (7 + 0 + 2) = 216*/
/*如果用邊輸入邊解答的方式，可能會TLE，
 * 所以先建表算出1到100,000的答案。建表要從100,000往下算，才能算出最小值的答案。*/
/*int tmp = i;
				int sum = i;
				while(tmp > 0)
				{
					sum += tmp % 10;
					tmp = tmp / 10;
				}
				table[sum] =i;*/

/*if(sum <= 100000 && table[sum]==0)
				{
					table[sum] = i;
				}*/