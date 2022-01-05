package lecture8;
import java.util.Scanner;
public class Sort01 {

	static void arrange(int[] arr)
	{
		int zeroCount=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==0)
				zeroCount++;
			
		}
		
		for(int i=0; i<zeroCount; i++)
			System.out.print("0 ");
		for(int i=zeroCount; i<arr.length;i++)
		{
			System.out.print("1 ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		arrange(arr);
	}

}
