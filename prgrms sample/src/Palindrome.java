import java.util.*;
public class Palindrome {
String word;
String rev="";
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	word=sc.nextLine();
	int len=word.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+word.charAt(i);
	}
	System.out.println("rev val"+rev);
	check();

}
boolean check()
{
	if(word.equals(rev))
	{
	  	return true;	
	}
	else
	{
		//System.out.println("Not palindrome");
		return false;
	}
}
public static void main(String args[])
{
	Palindrome ob=new Palindrome();
	ob.accept();
	System.out.println(ob.check());
	
}
}
