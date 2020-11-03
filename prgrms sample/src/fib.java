/*import java.util.*;
public class fib {

	int n1=0,n2=1,n3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println(n1+""+n2);
		int num=sc.nextInt();
		fib ob=new fib();
		ob.fibnoci(num);

	}
	void fibnoci(int num)
	{
		System.out.print(n1+" "+n2);
		for(int i=2;i<num;i++)// 0,1,2,3,4
		{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
	}

}
*/
//import java.util.*;
/*public class fib
{
	int n1=0,n2=1,n3;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		fib ob=new fib();
		ob.fibonaci(num);
	}
	void fibonaci(int num)
	{
		System.out.println(n1+" "+n2);
		i=2;
		while(i<num)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		
			
			// n1 0 1 1 2
			// n2 1 1 2 3
			//n3 1 2 3 5
			 
			
		}
	}
}
*/
//WITH RECURSION
/*import java.util.*;
public class fib {

	int n1=0,n2=1,n3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//System.out.println(n1+""+n2);
		int num=sc.nextInt();
		fib ob=new fib();
		ob.fibnoci(num-2);//7

	}
	void fibnoci(int num)
	{
		System.out.print(n1+" "+n2);
		while(num!=0)
		{
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		num--;
		}
	}

}
*/
