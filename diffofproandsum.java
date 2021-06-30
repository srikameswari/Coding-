import java.util.Scanner;

public class diffofproandsum
{
	
public static void main(String[] args) 
{
	    
Scanner sc=new Scanner(System.in);
		
int n,r=0,m=1,s=0;
		
System.out.println("enter a number");
		
n=sc.nextInt();
		
while(n>0)
		
{

r=n%10;
		
m=m*r;
		
s=s+r;
		
n=n/10;
		
}
	
System.out.println(m);
		
System.out.println(s);
		
System.out.println("Difference id :"+(m-s));
		
		    
		
	
}

}
