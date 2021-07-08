import java.util.Scanner;

public class Main

{
	
public static void main(String[] args) 
{
	 
int[] array=new int[5];
 
Scanner in=new Scanner(System.in);
 
 
System.out.println("Enter elements in array:");
 
for(int i=0;i<5;i++)
 
array[i]=in.nextInt();
 
 

 for(int j=0;j<array.length;j++) 
{
 
boolean isPrime=true;
 
 
for(int k=2;k<array[j];k++)
 
{
 
if(array[j]%k==0)
{
 
isPrime=false;

 break;
 
}
 
}
 
if(isPrime)
 
System.out.println("\n");
 
System.out.println(array[j]); 
 
}
	
}

}
