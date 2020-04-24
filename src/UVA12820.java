import java.util.*;
class UVA12820
{
		public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			int Case = 0;
			while(sc.hasNextInt())
			{
				int cases = sc.nextInt();
				int count = 0;
				while(cases > 0)
				{
					String str = sc.next();
					int alphabet[] = new int[26];
		            int len = 0;
		            
		           char c[] = str.toCharArray();
		           for(int i=0;i<c.length;i++)
		           {
		        	   int x = (int)c[i];
		        	   alphabet[x - 'a']++;
		        	   len++;
		           }
		           
		           
		           boolean num[] = new boolean[31];
		           boolean isCool = true;
		           for (int i = 0; i < 26; i++)
		            {
		                if (alphabet[i] > 0)
		                {
		                    //看數字是否重複或字母只有一種
		                    if (num[alphabet[i]] || len == alphabet[i])
		                    {
		                        isCool = false;
		                        break;
		                    }
		                    else
		                        num[alphabet[i]] = true;
		                }
		            }
		           if(isCool)
		           {
		        	   count++;
		           }
					//System.out.println(Arrays.toString(alphabet));
		           cases--;
				}
				System.out.println("Case "+(++Case)+": "+count);
			}
		}
}