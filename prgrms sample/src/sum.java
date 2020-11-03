//LOCAL VARIABLE
/*public class sum {//accessing variables without creating obj reference.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=12;
		method(a,b);//actual parameters we are providing values as input to formal param
		
	}
	static void method(int a,int b)//formal parameters which takes values from input
	//we are eclaring int a and b; it is not neccesary to declare variables again
	{
		
		//int ai,bi;//local variable it is not accesible in psvm
		int sum=a+b;
		System.out.println(sum);
		
	}


}
//INSTANCE VARIABLE 
public class sum
{
	int a;
	int b;
	//int res;//instance var should access throygh obj ref
	public static void main(String args[])
	{
		int res;
		sum m = new sum();//creating obj;
		res=m.method(10,20);//if we declare a,b then it show error that static to non-static reference to variable is not possible;
		System.out.println(res);	
	}
	int method(int a,int b)
	{
		int sum=a+b;
		return sum;
	}
}
//STATIC VARIABLE;
public class sum
{
	static int a=11,b=22;//static variables are accesible without creating objs
	public static void main(String args[])
	{
		int sum=a+b;
		System.out.println(sum);
	
	}
}
*/
//TYPE CASTING
/*TWO TYPES OF CONVERSION
 * 1) WIDENING OR AUTOMATIC CONVERSION: BYTE-1>SHORT-2>INT-4>FLOAT-4>LOMG-8>DOUBLE-8
 * 2)NARROWING -(REVERSE)DOUBLE-8>FLOAT-4>LONG-8>INT-4>SHORT-2>BYTE-1  */
//WIDENING OR AUTOMATIC CONVERSION WHICH TAKES VALUE AS AUTOMATIC AND PRINTS
/*public class sum
{
	static int s;
	static long t;
	static float u;
	static double v;
	public static void main(String args[])
	{
		byte a=10;
		short b=20;
		 s=a;
		 t=b;
		 u=a;
		 v=b;
		System.out.println("int value:"+s +" long valu: "+t +" float val: "+u+"double: "+v);
}
}
*/
/*NARROW CONVERSION
public class sum//should convert from big datatype to small
{
	static float res;//static int res;since input is float and op is int smaller 
	public static void main(String args[])
	{
		double a=10.2;//float a=10.2f;
		double b=12.4;//float b=12.4f;//op:22 for int
		res=(float)(a+b);
		System.out.println(res);// op=22.0
	}
}
*/
/*PRIMITIVE DATA TYPES : BOOLEAN = T OR F DEFAULT VAL=F, I BIT
 *                       CHAR=2,'\U0000' AND '\UFFFF' 
 *                       BYTE =1 DV=0,
 *                       SHORT= 2 DV=0,
 *                       INT= 4 DV=0,
 *                       LONG=8 DV= 0L,
 *                       FLOAT= 4 DV=0.0F,
 *                       DOUBLE=8 DV=0.0D,
 */
/*NON PRIMITIVE DATA TYPES : STRING,ARRAYS*/
/*OPERATORS:
1.UNARY OPERATOR => A++,++A,B--,--B(POST AND PRE INCREMENT)
2.SHIFT OPERATOR => LEFT(<<) AND RIGHT(>>)
3.ARITHMETIC => /,*,+,-,%,
4.ASSIGNMENT => +=,-=,*=,/=,%=,=,&=,|=,^=,<<=,>>=,>>>=;
5.LOGICAL => &&,||
6.BITWISE => &,|
7.TERNARY => ? :
8.RELATIONAL => <,>,<=,>=,!=,==

*/
//UNARY OPERATORS
/*public class sum
{
	public static void main(String args[])
	{
		int a=10;
		int b=10;
		System.out.println(a++ + ++b);//10 11 =21
		System.out.println(a+" "+b);//11 11
		System.out.println(a++ + ++a);//11 13 =24
		System.out.println(a+" "+b);//13 11
		System.out.println(++b + b++);//12 12 =24
		System.out.println(a+" "+b);//13 13//UNARY 
		System.out.println(a<<5);//13*2^5=13*32=416//LEFT SHIFT
		System.out.println(b>>4);//13/2^4=13/16=0//RIGHT SHIFT
		
						
		
	}       
}
*/
/*public class sum
{
	public static void main(String args[])
	{
		int a=10;
		int b=12;
		int res;
		System.out.println(a<b && a>++b);//LOGICAL AND IF 1ST FALSE AND IT NOT SECND COND
        //t && f =F
		System.out.println(b);//13
		System.out.println(a++>b && a<b);//f && t =F  10>12 && 12<13//LOGICAL AND
		System.out.println(a);//11
		System.out.println(++a<b & a!=b);//t & t= T BITWISE AND
		System.out.println(a);//12
		System.out.println(a<b || a>b);//t || f =T LOGICAL OR
		System.out.println(a!=b | a>b);//T |F=T    BITWISE OR
		res=(a>b)?a:b;//ternary operator 12>13 =F OP=13
		System.out.println(res);
		
	}
}
*/
/*CONTROL STATEMENTS
 1.IF
 2.IF-ELSE
 3.IF-ELSE-IF....
 4.NESTED IF(IF IF ELSE ELSE)
  */
/*public class sum
{
public static void main(String args[])
{*/
	/*int age =18;
	if(age>=18)
	System.out.print("major");
	else
		System.out.print("minor");
		
	
	int num=12;
	if(num%2==0)
		System.out.println("even");
	else
		System.out.println("odd");
	*/	
	/*int leap=2010;//5
	if(((leap%4==0)&&(leap%4!=100))||(leap%400==0))
		System.out.println("leap yr");
	else 
		System.out.println("not leap");
	
	
	
	
	}
}
*/
//if-else if
/*public class sum
{
	static int math=50;
	static int ph=40;
	static int soc=60;
	static int tot=math+ph+soc;
	public static void main(String args[])
	{
			if(math<=30 && ph<=30 && soc<=30 && tot<150)
		{
			System.out.println("fail");
		}
		else if(math>=90 && ph>=90 && soc<=90 && tot>250)
		{
			System.out.println(" A GRADE");
		}
		else if(math>=70 && ph>=70 && soc<=70 && tot>150)
		{
			System.out.println(" A GRADE");
		}
		
		else if(math>=40 && ph>=40 && soc>=40 && tot>=150)
		{
			System.out.println(" c GRADE");
		}
		else
		{
		System.out.println("invalid");
}
	}
}
*/