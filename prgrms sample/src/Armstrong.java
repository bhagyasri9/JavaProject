/*import java.util.Scanner; 
public class Armstrong{
	static void armstrong(int num)
	{
		temp=num;//153
		while(num>0)
		{
			rem=num%10;
			res=res+(rem*rem*rem);
			num/=10;	
		}
		//System.out.println("res"+res);
	}
		
	if(temp==res)
			{
			System.out.println("armstrong number");
		}
			else
			{
				System.out.println("not armstrong");
			}

public static void main(String args[])
{
	int rem,res,temp;
	Armstrong obj=new Armstrong();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter Value");
	int num=sc.nextInt();
	armstrong(num);
}
}

import java.util.*;
public class Armstrong
{ 	static boolean accept(int num)
	{
	    int rem=0,val=0;
	    int temp=num;
	    while(num>0)
	    {
	    rem=num%10;
	    val=val+(rem*rem*rem);
	    num/=10;
	    }
	    if(temp==val)
	    {
	    	//System.out.println("Armstrong number");
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
			}
	public static void main(String args[])
	{
		Armstrong ob=new Armstrong();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int num=sc.nextInt();
		System.out.println(accept(num));
	}
}

public class Armstrong
{
	     public static void main(String args[])
	{
	    int num=10;
        String s="N";
		System.out.println(s+" "+num+"x"+s+" "+num*num+"x"+s +" "+num*num*num+"x"+s);
		for(int i=1;i<=5;i++)
		{
			for(int j=10;j<=50;j++)
			{
			System.out.println(i+"  "+j*i+"   "+j*j*i+"   "+j*j*j*i);
			}
			}
	
	}
}*/
