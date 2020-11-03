/*
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[4];//declaring and instantiation
		a[0]=10;//intializing
		a[1]=11;
		a[2]=12;
		a[3]=13;
		int len=a.length;
		System.out.println("array lenght:"+len);
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
	}

}

//FOR EACH LOOP
public class Array
{
	public static void main(String args[])
	{
		int a[]= {10,12,14,16};
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.print("  "+a[i]);
			for(int i:a)
			{
				System.out.print(" "+i);//not specifies a[i] get error aray out of bound
			}
		//}
	}
}
//PASSING ARRAY TO METHOD
public class Array
{
	static void minimum(int a[])
	{
		int min=a[0];
		int max=a[1];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
				System.out.println("min val:"+min);
			}
			if(a[i]>max)
			{
				max=a[i];
				System.out.println("max val:"+max);
				
			}
		}
		
	}
	public static void main(String args[])
	{
		int a[]= {10,12,8,15};
		minimum(a);
	}
}
//OUTPUT:min val:8
//maxval:15

//ANONYMOUS ARRAY: means we can directly pass array without declaring it means we can change value
public class Array
{
	static void minimum(int a[] )
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String args[])
	{
		minimum(new int[] {30,12,15,16});
	}
}

 //RETURNING ARRAY FROM THE METHOD
public class Array
{
	static int[] getArr()
	{
		//int a[]= {1,4,3,2};   //return a;
		return new int[] {1,5,8,4}; 
	}
	public static void main(String args[])
	{
		int b[]=getArr();
		for(int i:b)
		{
			System.out.println(i);
		}
		
	}
}

//MULTIDIMENSIONAL ARRAY
public class Array
{
	public static void main(String args[])

	{
		int a[][]= {{1,2,3},{5,6,7}};
		int b[][]= {{1,2,3},{5,6,7}};
		int c[][]=new int[2][3];
		int row=a.length;
		int col=a[0].length;
		System.out.println("row:"+row+"col:"+col);
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];//0 1  j=0 1 2 
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
	}
}
*/
import java.util.*;
public class Array
{
	public static void main(String args[])
	{
		//int a[][];
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.println(a[i][j]);
				}
			}
		}
		
}
