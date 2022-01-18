package two_DimArray;
import java.util.Scanner;
public class InputAndPrint {
	
	public static void rowWiseSum(int[][] mat) {
		int row=mat.length; int col=0;
		if(row>0)
		{
         col=mat[0].length;
		}
		
		
        
        
        for(int i=0; i<row; i++)
        {
            int sum =0;
            for(int j=0; j<col; j++)
            {
                sum = sum+mat[i][j];
                
                    
            }
            System.out.print(sum+" ");

        }
        
       
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows ");
		int r = sc.nextInt();
		System.out.println("Enter number of columns ");
		int c = sc.nextInt();
		int[][] arr2d = new int[r][c];
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				arr2d[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
			{
				System.out.print( arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		rowWiseSum(arr2d);

	}

}
