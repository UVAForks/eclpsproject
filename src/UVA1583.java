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
/*�D�N: A = B+(b1+b2+b3)   207 => 207 + (7 + 0 + 2) = 216*/
/*�p�G�����J��ѵ����覡�A�i��|TLE�A
 * �ҥH���ت��X1��100,000�����סC�ت�n�q100,000���U��A�~���X�̤p�Ȫ����סC*/
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