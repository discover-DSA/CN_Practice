package lecture7;
import java.util.Scanner;
public class Pattern1 {

	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in	);	
		int n = sc.nextInt();
		int c=n;
		for(int i=1; i<=n; i++)
		{
			int p=n; 
			for(int j=1; j<=n; j++)
			{
				if(j==c)
				{
					System.out.print("*");
					c--;
					p--;
					
				}
			else {
				System.out.print(p);
				p--;
			
				}
			}
			System.out.println();
		}

	}

}*/
	
	
	  public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		    int lines=sc.nextInt();
		    int i,j;
		    for(i=1;i<=lines;i++){// this loop is used to print lines
		      for(j=1;j<=lines;j++){// this loop is used to print * in a line
		          if(i==j)
		             System.out.print("*");
		            else
		           System.out.print("0");
		      }
		      j--;
		       System.out.print("*");
		      while(j>=1){// this loop is used to print * in a line
		          if(i==j)
		           System.out.print("*");
		          else
		           System.out.print("0");
		          j--;
		      }
		    System.out.println("");
		    }
}
}