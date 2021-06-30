import java.util.Scanner;

public class Replace
{
	
public static void main(String[] args) 
{
	    
Scanner sc = new Scanner(System.in);
		
int actual_num=sc.nextInt();
		
int source=sc.nextInt();
		
int destination=sc.nextInt();
		
String s_actual_num=String.valueOf(actual_num);
		
String s_source=String.valueOf(source);
		
String s_destination=String.valueOf(destination);
		
String result="";
		
for(int i=0;i<s_actual_num.length();i
++)
		
{
		    
String n=String.valueOf(s_actual_num.charAt(i));
		    		    
if(n.equals(s_source))
		   
 {
		        
result=result+s_destination;
		   
 }
		   
 else
{
		        
result=result+n;
		    
}
		    
		   
 }
		    
System.out.println(result);
		
}
		
	
}
