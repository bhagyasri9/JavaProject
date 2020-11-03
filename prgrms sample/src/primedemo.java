import java.util.*;
public class primedemo {

	static int start,end;
	static int flag;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		start =s.nextInt();
		end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			flag=0;
			System.out.print(i +" i val");
			for(int j=2;j<i;j++)
			{
				
				System.out.println(j +" "+"j val");
				if(i%j==0)
				{
					System.out.println(i +" "+"not a prime");
					flag=1;
				break;
				
				}		
		    }
			if(flag==0)
			{
			System.out.println(i+" a prime");
					
			}
			
	  }
}
	
}