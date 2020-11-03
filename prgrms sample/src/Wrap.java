
/*public class Wrap {
Integer meth1(double d)
{ 
	Integer a =10;
 return a.intValue(); 

	
}
float meth2(Integer l)
{
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10;
		Integer j=new Integer(i);
		//ob.meth1(50.2);

	}

}
*/
import java.util.Arrays;
import java.util.Random;
public class Wrap
{
	public static void main(String args[])
	{
		String str="abecdfghijklmnopqrstuvwxyz";
		//char[] arr=str.toCharArray();
		int size=str.length();
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		Random r=new Random();
		for(int i=0;i<50;i++)
		{
	     	System.out.print(str.charAt(r.nextInt(size))+" ");
			
		}
		System.out.println();
		System.out.print(new String(arr));		

		
	}
}

/*import java.util.Random;
import java.util.Arrays;

public class Wrap
{
	public static void main(String args[])
	{
	
		String str="abcdefghijklmnopqrstuvwxyz";
		char[] arr=str.toCharArray();
		Arrays.sort(arr);
		System.out.print(new String(arr));		

	}
	
}  
*/