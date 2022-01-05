package lecture8;
import java.util.Scanner;
public class Arrays1_Assignments {
static int temp =0;
	static int returnUnique(int[] arr, int n)
	{
		int ind=0;int j=1;
		for( int i=0; i<n; i++)
		{
			temp=arr[i];
			j=i+1;
			while(j<n)
			{
				if(arr[i]==arr[j])
				{
					ind = 1;
					break;
				}
				j++;
			}
			
			
		}
		if(ind==0)
			return -1;
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(returnUnique(arr, n));

	}

}
