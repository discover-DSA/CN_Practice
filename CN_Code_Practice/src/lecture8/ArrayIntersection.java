package lecture8;
import java.util.Scanner;
public class ArrayIntersection {

	static void arrInt(int[] arr1, int[] arr2)
	{
		for( int i=0; i<arr1.length; i++)
        {
           int count=1;
            for(int j=0; j<arr2.length; j++)
            {
                if(arr1[i] == arr2[j] && count<=1 )
                {
                    count =2;
                    System.out.print(arr1[i]+" ");
                }
              
        	}
        }
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++)
			arr1[i] = sc.nextInt();
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		
		
		for(int i=0; i<m; i++)
			arr2[i] = sc.nextInt();
		
		arrInt(arr1, arr2);

	}

}
