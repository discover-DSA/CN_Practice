package lecture4;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int flag=0;    	//if flag is 0 no is prime
		int a = sc.nextInt();
		for(int i=2; i<=a/2; i++)
		{
			if(a%i==0)
			{
				//System.out.println(a + " is not prime");
				 flag = 1;
				break;
			}
			
		}
		
		if(flag==1)
		{
			System.out.println(a + " is not prime");
		}
		else
		{
		System.out.println(a + " is prime");
		}

	}

}
