//factorial
/*public class fact {
	int num,fact=1;
	static int res;
	public static void main(String args[])
	{
		fact ob=new fact();
		ob.num=4;
		res=ob.facto(ob.num);
		System.out.println("factorial of  given no "+ob.num+"is:"+res);
		
	}
	int facto(int num)
	{
	int i=1;
		while(i<=num)//5
	{
		fact*=i;
		i++;
	}
		return fact;
	}
	
{
	 for(int i=1;i<=num;i++)//1<4 1*1*2=2*3=6*4=24
		 fact*=i;
	 return fact;
	}

}
*/
//factorial of  given no 4is:24


//WITH RECURSION MEANS CALLING METHOD ITSELF
/*public class fact
{
	int num,fact =1;
	static int res;
	public static void main(String args[])
	{
		fact obj=new fact();
		res=obj.facto(5);
		System.out.println(res);
	}
	int facto(int num)
	{
	
			if(num==0 || num==1)
			{
				return 1;
			}
			else
			{
				System.out.println(num);
				return (num*facto(num-1));
				//5*4=20//20*3=60//60*2=120
			}
		
	}
}
*/
//prime numbers=WHICH ARE DIVISBLE BY 1 AND ITSELF
/*public class fact
{
	int num;
	int flag=0;//TO HECK WHETHER IT IS PRIME OR NOT;
	public static void main(String args[])
	{
		fact ob=new fact();
		ob.prime(17);
		
	}
	void prime(int num)
	{
	for(int i=2;i<num-1;i++)	
	{
		if(num%i==0)//7%2,3,4,5,6
		{
			System.out.println("not prime");
			flag=1;
			break;
		}
	}
	if(flag==0)
			System.out.println("prime");		
	}

	}
*/
/*public class fact
{
	int num;
	int temp;
	public static void main(String args[])
	{
		fact ob=new fact();
		ob.prime(5);
	}
	void prime(int num)
	{
	for(int i=2;i<=num/2;i++)
	{
		if(num%i==0)//11% 2,3,4,5,6,7,8,9,10
			temp++;
	}
	if(temp>0)
	{
		System.out.println("not prime");
	}
	else
	{
		System.out.println("prime");
	}
	}
}
*/
// PRIME SERIES
/*public class fact
{
	int start,end;
	//int num;
	int flag=0;
	public static void main(String args[])
	{
		//int num;
		fact ob=new fact();
		ob.prime(3,11);
		 
	}
	void prime(int start,int end)
	{
	for(int i=start;i<end;i++)
	{
		flag=0;
		System.out.println("i value is: "+ i);
		for(int j=2;j<i;j++)//3 3<3
		{
			System.out.println("j value:"+j);
			if(i%j==0)//
			{
			 System.out.println(i+"is not prime");
			 flag=1;
			 break;
			 
			}
		}
		
		if(flag==0)
		{
			System.out.println("prime no series:"+i);
		}
		
	}
	}
}
*/
//import java.util.*;
/*public class fact
{
	static int start,end;
	int flag;
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter start value");
		start=s.nextInt();
		System.out.println("enter end value");
		end=s.nextInt();
		fact ob=new fact();
		ob.prime(start,end);
				
	}
	
	void prime(int start,int end)
	{
	for(int i=start;i<end;i++)
	{
		flag=0;//temp =0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=1;
				break;//temp++;
			}
		}
		
		//if(temp>0)
		//{
		//	System.out.println(i+":not a prime");
			
		//}
		//else
		//{
		//	System.out.println(i);
		//}
		
		if(flag==0)
		{
			System.out.println("prime numbers are:"+i);
		}
	}
	}
}
*/
/*
enter start value
2
enter end value
19
prime numbers are:2
prime numbers are:3
prime numbers are:5
prime numbers are:7
prime numbers are:11
prime numbers are:13
prime numbers are:17

*/