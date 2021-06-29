import java.util.Scanner;

public class Main

{
	
public static void main(String[] args) 
{
	    
Scanner scan=new Scanner(System.in);
	    
int r=0;
	    
int n=scan.nextInt();
	    
	   
while(n!=0)
	  
{
	      
 r=n%10;
	      
 n/=10;
	       
if(r%2==0)
	      
 {
	        
System.out.println("This is even:"+r);   
	       
}
	     
 if(r%2!=0)
	      
{
	       
 System.out.println("This is odd:"+r);  
	       
}
	  
}
	
}

}