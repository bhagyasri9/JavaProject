/*import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.println(i+" "+j);
			}
		}

	}

}
*/ 
/*op:
 * enter the row value: 3
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3

 */
//RIGHT TRIANGLE
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row value");
		int row=sc.nextInt();
		methodrow(row);
		
	}
	static void methodrow(int row)
	{
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/
/*	OUTPUT:
 enter row value
4
*
**
***
****
	
 */
//MIRROR RIGHT TRIANGLE:
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row value");
		int row=sc.nextInt();
		pattern obj=new pattern();
		obj.methodrow(row);
		
	}
	void methodrow(int row)// i=1 2 3 4 k=4 3 2 1
	{
		for(int i=1;i<=row;i++)
		{
			for(int k=row-i;k>0;k--)//5-1=4 5-2=3 5-3=2 5-4=1 ===> 4 times //i=2 5-2=3,2,1          ===>3 times
			// (or) for(k=1;k<row-i;k++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/

/*
enter row value
5
----*
---**
--***
-****
*****
*/

//box model both row and col same
/*import java.util.*;
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row value:");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	} 
}       */

/*
 enter the row value:
4
****
****
****
**** 
 
 *///DOWNWARD  LEFT TRIANGLE:
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int row =sc.nextInt();
		for(int i=1;i<=row;i++) //(or) for(int i=row;i>0;i--)//i=7 i=6,5,4,...
		{
			for(int j=i;j<=row;j++)//(or) for(j=1;j<=i;j++)//j=1 to 7,1 to 6,....
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

/*
enter a value
6
******
*****
****
***
**
*
comment
*/
//DOWNWARD WITH RIGHT TRIANGLE
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a row value");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<i;k++)//1234 //-123  //--12	
			{ 
				System.out.print("-");
			}
			for(int j=i;j<=row;j++)
			{
				System.out.print("*");
			}
		    System.out.println();		
		}
	}
}
*/

/*
enter a row value
7
*******
-******
--*****
---****
----***
-----**
------*
coment
*/
//PYRAMID
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int row;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row value:");
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=(row-i);k++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
*/

/*
enter row value:

5
---- 1
--- 1 2
-- 1 2 3
- 1 2 3 4
 1 2 3 4 5

*/
//DIAMOND SHAPE PATTERN
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int row;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row value");
		row=sc.nextInt();
		 for(int i=1;i<=row;i++)                 
		{
			for(int k=1;k<=(row-i);k++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=1;i<row;i++)//i=3 2 1 j=1 2 k=3<=(row-i=3,)
		{
			//System.out.print("i value:"+i+"row val:"+row);
		for(int k=1;k<=i;k++)
		{
			System.out.print("-");
		}
		for(int j=1;j<=row-i;j++)//row=4 3 2 1
		{
		 	System.out.print("*");
		}
		for(int j=2;j<=row-i;j++)//
		{
			System.out.print(" *");
		}
		System.out.println();
		}
		
	}
}
*/

/*
enter row value
6
-----*
----** *
---*** * *
--**** * * *
-***** * * * *
****** * * * * *
-***** * * * *
--**** * * *
---*** * *
----** *
-----*
*/
//REVERSE PYRAMID
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int row;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		for(int i=1;i<=row;i++)//i=row-i i>0
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("-");
			}
			for(int j=i;j<=row;j++)
			{
				System.out.print("*" + " ");
			}
			System.out.println();
			
		}
	}
}
*/

/*
7
-* * * * * * * 
--* * * * * * 
---* * * * * 
----* * * * 
-----* * * 
------* * 
-------* 

*/

//RIGHT PASCAL TRIANGLE
/*import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int row;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
*/
/*
5
* 
* * 
* * * 
* * * * 
* * * * * 
* * * * 
* * * 
* * 
* 

*/
//Left PASCAL TRIANGLE
import java.util.*;
public class pattern
{
	public static void main(String args[])
	{
		int row;
		Scanner sc=new Scanner(System.in);
		row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=row-i;k++)
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=row-1;i>0;i--)//i=4
		{
			for(int k=1;k<=row-i;k++)//1<=5-4
			{
				System.out.print("-");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
/*
5
----*
---**
--***
-****
*****
-****
--***
---**
----*



*/