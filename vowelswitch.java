import java.util.Scanner;

public class vowelswitch

{
	
public static void main(String[] args) 
{
	    
boolean x=false;
	
Scanner scan=new Scanner(System.in);
	
System.out.println("Enter a character : ");
	
char ch=scan.next().charAt(0);
	switch(ch)
	
{
	   
case 'a' :
	   
case 'e' :
      
 case 'i' :
	   
case 'o' :
	   
case 'u' :
	   
case 'A' :
	   
case 'E' :
	   
case 'I' :
	   
case 'O' :
	   
case 'U' : x = true;
	
}
	
if(x==true)
	
System.out.println(ch+" is a vowel");
	
else
	
System.out.println(ch+" is a consonat");
	
}

}