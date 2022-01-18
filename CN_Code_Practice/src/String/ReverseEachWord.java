package String;
import java.util.Scanner;
public class ReverseEachWord {
	
	static String  reverseEachWord(String str)
	{
		String ans="";
		int currentWordStart=0;
		int l=str.length();
		int i=0;
		String reversedWord="";
		for(;i<l;i++)
		{
			if(str.charAt(i)==' ')
			{
				int currentWordEnd=i-1;
				
				for(int j=currentWordStart; j<=currentWordEnd; j++)
				{
					reversedWord = str.charAt(j)+ reversedWord;
				}
				
				ans= ans+reversedWord+" ";
				currentWordStart=i+1;
			}
			
			int currentWordEnd=i-1;
			//String reversedWord1="";
			for(int j=currentWordStart; j<=currentWordEnd; j++)
			{
				reversedWord = str.charAt(j)+ reversedWord;
			}
			
			
			//return ans;
		}
		ans= ans+reversedWord;
		return ans;
			
	}	
			public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		reverseEachWord(str);
		

	}

}
