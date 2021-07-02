import java.util.Scanner;

public class Main

{
	
public static void main(String[] args)
 {
		
int i,count=0,X, count1=0;
		
Scanner sc=new Scanner(System.in);
		
X=sc.nextInt();
		
for(int n=1;n<=X;n++)
		
{
		    
count=0;
		    
for(i=1;i<=n;i++)
		   
 {
		        
if(n%i==0)
		      
 {
		           
 count++;
		       
 }
		   
 }
		   
 if(count==2)
		  
 {
		       
 count1++;
		    
}
		
}
		
System.out.println(count1);
	
}	

}
