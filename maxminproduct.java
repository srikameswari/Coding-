import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n;
	    n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.print("Elements in array: ");
	    for(int j=0;j<n;j++)
	    {
	    a[j]=sc.nextInt();
	    }
		int max=0,min=a[0];
		for(int i=0;i<=n-1;i++)
		{
		    if(max<a[i])
		    {
		        max=a[i];
		        
		    }
		    if(min>a[1])
		    {
		        min=a[i];
		        
		    }
		    
		}
		System.out.print("min = "+min);
		System.out.println("max = "+max);
	    System.out.println("Product = "+ (max*min));
	}
}
