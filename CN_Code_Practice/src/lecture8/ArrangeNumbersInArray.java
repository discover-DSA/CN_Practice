package lecture8;
import java.util.Scanner;
public class ArrangeNumbersInArray {
	static void arrange(int n, int[] arr)
	{
		int y=0;
		 int odd=0, even=0;
	        if(n%2==0)
	        {
	            odd=n/2;
	        	even=n/2;
	        	y=n;
	            
	        }
	        else if(n%2!=0)
	        {
	            odd=n/2+1;
	            even=n/2;
	            y=n-1;
	        }
	            
	      
	        
			for(int i=0,x=1; i<odd; i++)
	        {
	            
				arr[i] = x;
				x=x+2;
	            
			}
			
			for(int i=odd; i<n; i++)
			{
	            
	        
				arr[i]=y;
	            y=y-2;
	                
			}
			
	}
	
	
	static void print(int[] arr )
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		arrange(n, arr);
		print(arr);

	}

}
