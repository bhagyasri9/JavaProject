//DEFAULT CONSTRUCTOR
/*public class construct {

	int x;
	String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	construct obj=new construct();
	System.out.println(obj.x);
	System.out.print(obj.s);
	}

}
//NO ARGUMENT CONSTRUCTOR
public class construct
{
	construct()
	{
		int x=10;
		System.out.println(x);

		System.out.println("hi");
	}
	public static void main(String args[])
	{
		construct obj=new construct();
	}
}
//PARAMETERISED CONSTRUCTOR
public class construct
{
	int i;
	String n;
	construct(int id,String name)
	{
		i=id;
		n=name;
		//System.out.println(i+" "+n);
	}
	void display()
	{
		System.out.println("values are "+i+"  "+n);
	}
	public static void main(String args[])
	{
		construct b=new construct(101,"manu");
		construct b1=new construct(102,"ravi");
		b.display();
		b1.display();

	}
}

// CONSTRUCTOR OVERLOADING
public class construct
{
	int i;
	String n;
	String clg;
	construct(int id,String name)
	{
		i=id;
		n=name;
		//System.out.println(i+" "+n);
	}
	construct(int id,String name,String cl)
	{
		this(id,name);
		clg=cl;
		
	}
	void display()
	{
		System.out.println("values are "+i+"  "+n+" "+clg);
		
	}
	public static void main(String args[])
	{
		construct b=new construct(101,"manu");
		construct b1=new construct(102,"ra","gmr");
		b.display();
		b1.display();

	}
}

//COPY CONSTRUCTOR
public class construct
{
	int id;
	String nm;
	construct(int a,String n)
	{
		id=a;
		nm=n;
	}
	construct (construct s)
	{
		id=s.id;
		nm=s.nm;
	}
	void display()
	{
		System.out.println("value"+id+"  "+nm);
	}
	public static void main(String args[])
	{
		construct b=new construct(101,"ravi");
		construct b1=new construct(b);
		b.display();
		b1.display();
		
	}
}
//COPY VALUES WITHOUT CONSTRUCTOR
public class construct
{ int id;
String name;
	construct(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	construct()
	{
		
	}
	void display()
	{
		System.out.println(id+"  "+name);
	}
	public static void main(String args[])
	{
		construct b=new construct(11,"manu");
		construct b1=new construct();
			b1.id=b.id;
			b1.name=b.name;
			b.display();
			b1.display();
			
	}
}

//STATIC KEYWORD
public class construct
{
	//int a=10;//Cannot make a static reference to the non-static field a
    static int a=10;
	public static void main(String args[])
	{
		System.out.println(construct.a);//or s.o.p(a);
	}
}
//STATIC VARIABLE 
public class construct
{
	int id;
	String nm;
	static String clg="mvr";
	construct(int id,String nm)
	{
		this.id=id;
		this.nm=nm;
		//System.out.println(id+" "+nm+" "+clg);
	}
	void display()
	{
		System.out.println(id+" "+nm+" "+clg);

	}
	public static void main(String args[])
	{
		 construct b=new construct(101,"rina");
		 construct b1=new construct(121,"ria");
		 construct b2=new construct(131,"sannu");
		 b.display();
		 b1.display();
		 b.display();
		 b2.display();
}
*/
