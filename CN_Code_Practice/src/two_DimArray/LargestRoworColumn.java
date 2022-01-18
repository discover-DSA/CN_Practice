package two_DimArray;

import java.util.Scanner;

public class LargestRoworColumn {
	static int ri=0,rs=0,ci=0,cs=0,Frs=-2147483648,Fcs=-2147483648;
	
	 
	public static void RCsum(int mat[][])
	{
		int row = mat.length;
	     int col=0;
	     
	     if(row>0)
			{
	      col=mat[0].length;
			}
	
		for(int i=0; i<row; i++)
		{
			rs=0;
			for(int j=0; j<col; j++)
			{
				rs=rs+mat[i][j];
			}
			if(rs>Frs)
			{
				Frs=rs;
				//System.out.println(Frs);
				ri=i;
				//System.out.println(ri);
			}
		}
	
	
		int i=0;
		while(i<col)
		{
			cs=0;
			{
				for(int j=0; j<row;j++)
				{
					cs = cs+mat[j][i];
				}
			}
			
			if(cs>Fcs)
			{
				Fcs=cs;
			//	System.out.println(Fcs);
				ci=i;
				//System.out.println(ci);
			}
			i++;
		}
	
		
	
	
	
		if(Frs>=Fcs)
		{
			System.out.println("row "+ ri+" "+ Frs);
		}
		else if(Fcs>Frs)
		{
			System.out.println("column "+ ci+" "+ Fcs);
		}
		else if(Fcs<0 && Frs<0)
		{
			System.out.print("row "+ "0 "+ "-2147483648");
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
		RCsum(arr2d);
		//Csum(arr2d);
		
		
		
		

	}

}

