package String;
import java.util.Scanner;
public class PermutationString {

	static boolean isPermutation(String str1, String str2)
	{
		StringBuffer str = new StringBuffer(str2);
		int checkFlag=1;
		if(str1.length()!=str2.length())
		{
			return false;
		}
		
			for(int i=0; i<str1.length(); i++)
			{
				checkFlag=1;
				 
				for(int j=0; j<str1.length(); j++)
				{
					
					if(str1.charAt(i)==str.charAt(j))
					{
						str.setCharAt(j,  ' ');
						checkFlag= 0;
						
					}
				}
				
						
			
			}
			if(checkFlag==0)
				return true;
			else 
				return false;
		
			
		
		
	}	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1= sc.nextLine();
		String str2= sc.nextLine();
		System.out.println(isPermutation(str1, str2));
		
		
	}
	
	

}
