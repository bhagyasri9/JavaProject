import java.util.*;
public class ArraySamp {
int max(int arr[])
{
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]>max)
	{
		max=arr[i];
	}
	}
return max;	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArraySamp ob=new ArraySamp();
        System.out.println(ob.max(arr));
	}

}
