package String;
import java.util.Scanner;

import javax.xml.stream.events.StartDocument;
public class ReverseStringWordwise {
	static void RevStrWordwise(String str)
	
	{
		int n = str.length()-1;
		
		int startIndex=n;
		int endIndex=0;
		int i=n;
		String reversedString="";
		for(; i>=0; i--)
		{
			if(str.charAt(i)==' ')
			{
				endIndex=i+1;
				
				 while(startIndex>=endIndex)
				 {
					 reversedString=str.charAt(startIndex)+reversedString;
					 
					 startIndex--;
				 }
				 reversedString=reversedString+" ";
				// System.out.print(reversedString);
				
			}
		}
			endIndex=0;
			startIndex--;
			//String reversedString="";
			 while(startIndex>=endIndex)
			 {
				 reversedString=reversedString + str.charAt(endIndex);
				 
				 endIndex++;
			 }
			 
			 System.out.print(reversedString);
			
			
		
		
		
		
	}

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		RevStrWordwise(str);

	}

}
