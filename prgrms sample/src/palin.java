//PALINDROME ex : 121, 151,454 ...
/*import java.util.*;
public class palin
{
	static int num,temp;
	int rem=0,rev=0;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		num=sc.nextInt();//121
		palin obj=new palin();
		//ob.num=121;
		obj.palindrome(num);
	}
	void palindrome(int num)//121
	{
		temp=num;
		while(num>0)//121 12 1 
		{
		rem=num%10;
		System.out.println("rem is :"+rem);
		rev=rev*10+rem;
		System.out.println("rev is :"+rev);
		num/=10;
		System.out.println("num is :"+num);
		}
	if(rev==temp)
		System.out.println("palindrome");
	else
		System.out.println("not palindrome");
	
	}
}
*/
/*OP:
 * enter value
783                  121
rem is :3            1
rev is :3            1
num is :78           12
rem is :8            2
rev is :38           12
num is :7            1
rem is :7            1
rev is :387          121
num is :0            0
not palindrome       palindrome
 */
import java.util.*;
public class palin
{
	//static int num;
	static String input,reverse="";
	
	public static void main(String args[])
	{
		//String input,reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		input=sc.nextLine();
		int temp=input.length();//121
		System.out.println("length of given input:"+temp);
		for(int i=temp-1;i>=0;i--)//i=2
		{
		reverse=reverse+input.charAt(i);
		System.out.println(reverse);//""+madam
		}
		System.out.println("reverse value is:"+reverse);
		System.out.println("input value is:"+input);
		if(input.equals(reverse))
			System.out.println("palindrome");		
		else
			System.out.println("not palindrome");
			
	}
}


