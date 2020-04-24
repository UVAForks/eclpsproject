import java.util.*;
public class UVA10050
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(sc.hasNextInt())
		{
			int days=sc.nextInt();
			int teams = sc.nextInt();
			int  parameter[] = new int[teams];
			for(int i=0;i<parameter.length;i++)
			{
				parameter[i] = sc.nextInt();
			}
			boolean count[] = new boolean[days];
			String week[] = {"Su","Mo","Tu","We","Th","Fr","Sa"};
			for(int i=0;i<parameter.length;i++)
			{
				for(int j=1;j<=days;j++)
				{
					if(j%parameter[i] == 0)
					{
						int index = j-1;
						if(index >= 7)
						{
							index = index % 7;
						}
						
						if(!week[index].equals("Fr"))
						{
							if(!week[index].equals("Sa"))
							{
								count[j-1] = true;
							}
						}
					}	
				}
			}
			int sum = 0;
			for(int i=0;i<count.length;i++)
			{
				if(count[i] == true)
				{
					sum++;
				}
			}
			//System.out.println(Arrays.toString(count));
			System.out.println(sum);
		}
	}
}
//System.out.println(j+" "+parameter[i]+" "+j%parameter[i]);
