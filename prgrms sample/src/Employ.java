import java.util.Scanner; 
public class Employ 
{ 
 int eno; 
 String ename; 
void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter eno:");
	eno=sc.nextInt();
	System.out.println("enter ename:");
	ename=sc.next();

}
 void display() 
  { 
 System.out.println("emp no:"+eno+" "+"emp name:"+ename); 
 }
  public static void main(String[] args) 
  { // TODO Auto-generated method stub
  
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter num of emps");
	  int num=sc.nextInt();
	  Employ e[]=new Employ[num];
	 for(int i=0;i<num;i++)
	 {
		 e[i]=new Employ();
		 e[i].accept();
	 }
  for(int i=0;i<num;i++)
  {
	  e[i].display();
  }
  
  }
  
  }

