package lecture8;
import java.util.Scanner;
public class TripletSum {
	
	public static int findTriplet(int[] arr, int x) {
  	  int pair = 0;
  	for(int i=0; i<arr.length; i++)
      {
          for(int j=i+1; j<arr.length; j++)
          {
              for(int k=j+1; k<arr.length; k++)
        		  {
              		if(arr[i]+arr[j]+arr[k] == x)
              {
                  pair = pair+1;
              }
          }
          
      }
      
  }
	return pair;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int x = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(findTriplet(arr, x));

	}

}
