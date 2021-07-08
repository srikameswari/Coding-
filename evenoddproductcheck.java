import java.util.Scanner;

public class Main

{
	
public static void main(String[] args) 
{
		
int x,i;
		
int evenCount=0, oddCount=0;
		
Scanner sc= new Scanner(System.in);
		
System.out.print("Enter size of an Array: ");
		
x=sc.nextInt();	
		
int a[]= new int[x];
		
System.out.print("Enter elements of an Array: ");
		
for (i=0;i<x;i++)
		
{
			
a[i]=sc.nextInt();
		
}   

		
for(i=0;i<x;i++)
		
{
			
if(a[i]%2==0)
			
{
				
evenCount++;
			
}
			
else
			
{
				
oddCount++;
			
}

		
}		
		
System.out.println("Total Number of Even Numbers= " + evenCount);
		
System.out.println("Total Number of Odd  Numbers= " + oddCount);
		
int m=evenCount*oddCount;
		
System.out.println("Multiplied value is: "+m);
		
if(m%2==0)
		
{
		    
System.out.println("even");
		
}
		
else
		
{
		   
 System.out.println("odd");
		
}
		
	
}

}
