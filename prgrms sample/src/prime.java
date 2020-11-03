/*import java.util.*;
public class prime {
	static int flag=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag++;
			}
		}
		if(flag>0)
		{
			System.out.println("not a prime no:");
			
		}
		else
		{
			System.out.println("prime no:");

		}

	}

}

import java.util.*;
public class prime {
	static int flag=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value:");
		num=sc.nextInt();
		for(int i=2;i<=num-1;i++)
		{
			
			if(num%i==0)
			{
				flag=1;
				break;// 
			}
		}
		if(flag==0)
		{
			System.out.println("prime no:");
			
		}
		else
		{
			System.out.println("not prime no:");

		}

	}

}
*/
import java.util.*;
public class prime
{
	public static void main(String args[])
	{
		int start,end,flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start and end val");
		start=sc.nextInt();
		//System.out.println("enter end val");
		end= sc.nextInt();
		for(int i=start;i<=end;i++)//5 to 11 j=
		{
			flag=0;
			for(int j=1;j<i;j++)
			{
			if(i%j==0)
			{
				flag=1;
			    break;
				
			}
			else
			{
				System.out.print(i+" "+"is a prime no");
			}
			
		}
			
	}
	}
}