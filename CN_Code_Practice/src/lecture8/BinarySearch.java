package lecture8;
import java.util.Scanner;
public class BinarySearch {

	static int binSearch(int[] arr, int start, int end, int x)
	{
		if(end>=start)
		{
		int mid = (start+end)/2;
		if(arr[mid]==x)
			return mid;
		
		if(x<arr[mid])
			return binSearch(arr, start, mid-1, x);
		return binSearch(arr, mid+1, end, x);
		
		
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(binSearch(arr, 0, n-1, x));
			

	}

}
