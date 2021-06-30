import java.util.Scanner;

public class Haeshad
{
	
public static void main(String[] args) 
{
		
Scanner sc=new Scanner(System.in);
		
int n,r,s=0; 
		
System.out.println("enter a number");
		
n=sc.nextInt();
		
int x=n;
		
while(n>0)
		
{
		   
 r=n%10;
		    
		   
 s=s+r;
		    
n=n/10;
		
}
		
System.out.println(s);
		
if(x%s==0)
		
System.out.println("It is a Harshad Number");
		
else
		
System.out.println("It is not a Harshad Number");


	
}

}