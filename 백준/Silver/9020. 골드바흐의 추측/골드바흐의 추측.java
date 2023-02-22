import java.util.*;

public class Main{
     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
		for(int i=0; i<cnt; i++)
		{
			int min=0;
			int target = in.nextInt();
			for(int j=target/2; j>=2; j--)
			{
				int flag=0;
				for(int z=2; z<j; z++)
				{
					if(j%z==0)
					{
						flag++;
						break;
					}
				}
				if(flag==0)
				{
					int m_flag=0;
					for(int x=2; x<target-j; x++)
					{
						if((target-j)%x==0)
						{
							m_flag++;
							break;
						}
					}
					if(m_flag==0)
					{
						min=j;
						break;
					}
					
				}
			}
			System.out.print(min+" ");
			System.out.println(target-min);
		}
		in.close();
     }
}