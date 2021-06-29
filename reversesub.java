import java.util.Scanner;

public class revsub

{
	
public static void main(String[] args) 
{
	
Scanner s=new Scanner(System.in);
	
int n= s.nextInt();
	
int r,rev=0;
	
while(n!=0)
	
{
	    
r=n%10;
	    
rev=rev*10+r;
	    
n=n/10;
	
}
	
	
System.out.println(rev);
	
}

}