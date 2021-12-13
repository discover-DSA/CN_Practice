package lecture6;
import java.util.Scanner;
public class SumPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			int sum=0;
			for(int j=1; j<=i; j++)
			{
				if(i==1)
				{
					System.out.println(i+"="+i);
					//System.out.println();
				}
				else if(j==i)
				{
				 
				 System.out.print(j);
				 sum=sum+j;
				}
				else
				{
					System.out.print(j+"+");
					 sum=sum+j;
					 
					 
				}
				
				
			}
			if(i==1)
			{
				continue;
			}
			System.out.print("="+sum);
			System.out.println();
		}

	}

}
