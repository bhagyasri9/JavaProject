/*import java.util.Scanner; 
public class sample {
	int rem,res,temp;
	void armstrong()
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		temp=num;//153
		while(num>0)
		{
			rem=num%10;
			res=res+(rem*rem*rem);
			num/=10;	
		}
		System.out.println("res"+res);
	}
		void display()
		{ 
			if(temp==res)
			{
			System.out.println("armstrong number");
		}
			else
			{
				System.out.println("not armstrong");
			}
	}
public static void main(String args[])
{
	sample obj=new sample();
	obj.armstrong();
	obj.display();
	
	
}
}

//import java.util.*;
public class sample
{
	
	public static void main(String args[])
	{
	
		int a=10,b=14,c=8;
		int res=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("The greatest value of 3 digits is: "+res);
	}
}

public class sample
{
	//boolean res=true;
	static boolean display(int a,int b)
	{
		            if(a>b)
		            	return true;
		            else
		            	return false;
	}
	public static void main(String args[])
	{
		//sample s=new sample();
		boolean res=display(10,5);
		System.out.println("boolean val is : "+ res);
	}
}

public class sample
{
	public static void main(String args[])
	{
		int farenheit=45;
		int celsius=((farenheit-32)*5)/9;
        System.out.println("celsius valvue is:" + celsius);
	}
}
*/
public class sample
{
	
	public static void main(String args[])
	{
		
		System.out.print("N\t10*N\t100xN\t1000xN\n");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"\t"+(10*i)+"\t"+(100*i)+"\t"+(1000*i));
		}
		
	}
}