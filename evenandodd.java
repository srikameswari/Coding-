import java.util.Scanner;

public class Main

{
	
public static void main(String[] args) 
{
	   
Scanner scan=new Scanner(System.in);
	   
int count=0, countO=0, r=0;
	  
 int n=scan.nextInt();
	   
int i = 0;
	   
while(n!=0)
	  
 {
	       
r = n%10;
	       
n/=10;
	       
if(r%2==0)
	       
{
	           
count++;
	       
}
	       
if(r%2!=0)
	      
 {
	         
 countO++;
	       
}
	   
}
	   
System.out.println("odd digits="+count);
	  
 System.out.println("even digits="+countO);
	   
	
}

}