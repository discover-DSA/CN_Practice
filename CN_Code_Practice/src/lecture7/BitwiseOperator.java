package lecture7;

import java.util.Scanner;
public class BitwiseOperator {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1=1, f2=1;int fno=0;
        int i=3;
        
        if(n==1 || n==2)
        {
            System.out.println("1");
        }
        else
        {
        while(i<=n)
        {
          
            {
                fno=f1+f2;
            }
           
            f1=f2;
            f2=fno;
            i++;
        }
        System.out.println(fno);
        }
            
	

		
	}

}