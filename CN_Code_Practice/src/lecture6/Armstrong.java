package lecture6;
import java.util.Scanner;
public class Armstrong {
	
	static int sum=0;
	
	static int checkArmstrong(int c, int t)
	{
		
		if(c==0)
			return 0;
		else
		{
			sum=(int) (sum+Math.pow(c%10, t));
			checkArmstrong(c/10,t);
			//System.out.println(sum);
			return sum;
			
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int c=n;
        int t=0;
            while(n>0)
            {
                t++;
                n=n/10;
            }
           // System.out.println(t);
			
			
		
		
		int res = checkArmstrong(c,t);
		if(res==c)
			System.out.println("true");
		else
			System.out.println("false");
		

	}

}
