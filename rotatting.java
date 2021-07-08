import java.util.Scanner;

public class Main

{
	
public static void main(String[] args) 
{
		
 Scanner sc=new Scanner(System.in);
		
 int size;  
        
 int n = 3; 
		 
System.out.println("Enter array size: ");
	    
size=sc.nextInt();
	    
int arr[]=new int[size];
	    
System.out.print("Elements in array: ");
	    
for(int j=0;j<n;j++)
	   
{
	       
arr[j]=sc.nextInt();
	   
}
        
        
for(int i = 0; i < n; i++){    
           
 int j, last;    
             
            
last = arr[size-1];    
            
            
for(j = arr.length-1; j > 0; j--)
{    
                
                
arr[j] = arr[j-1];    
           
 }    
                
            
arr[0] = last;    
        
}    
        
        
System.out.println();    
            
          
       
 System.out.println("Array after right rotation: ");    
        
for(int i = 0; i<size; i++)
{    
            
System.out.print(arr[i] + " ");    
      
 }    


	
}

}
