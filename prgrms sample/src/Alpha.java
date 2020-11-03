import java.util.*;
import java.util.concurrent.ThreadLocalRandom; 

class Alpha 
{ 
static String Random(int n) 
{ 
  
	int min=97,max=122;
	char[] a=new char[n];
	Random r=new Random();
	for (int i =0 ; i < n; i++) 
	{
		
	  a[i]=(char)(ThreadLocalRandom.current().nextInt(min,max));
	}
	String str=String.valueOf(a);
	return str;
	
	
} 
static String DuplicateEleme(char string[],int len)
{
	int index=0;
    int loop; 
    for (int i=0; i<len; i++) 
    {
    for(loop=0;loop<i;loop++)
    {
    	if(string[i]==string[loop])
    	{
    		break;
    	}
    }
    if(loop==i)
    {
    	string[index++]=string[i];	
    }
    }
  return String.valueOf(Arrays.copyOf(string,index)); 
} 
	
public static void main(String[] args) 
{ 
    int size = 10; 
    String string=Alpha.Random(size);
    System.out.println("Random generation of alphabets:"+string);
    char varb[]=string.toCharArray();
    Arrays.sort(varb);
    String string1=new String(varb);
    System.out.println("sorted elements:"+string1);
    char string2[]=string1.toCharArray();
    //System.out.println("string val:"+str3);
    int len = string2.length;  
    String result= Alpha.DuplicateEleme(string2,len);  
    System.out.println("remove duplicate elements:"+result); 
    
} 
} 