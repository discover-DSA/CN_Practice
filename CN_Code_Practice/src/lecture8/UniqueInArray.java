package lecture8;
import java.util.Scanner;
public class UniqueInArray {

	
	static int findUnique(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			int count = 1;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					count = 2;
				}
				
			}
			if(count==1)
				return arr[i];
			
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findUnique(arr));
			sc.close();
	}

}
