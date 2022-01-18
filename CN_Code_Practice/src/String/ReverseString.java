package String;
import java.util.Scanner;
public class ReverseString {

	static String revString(String str)
	{
		int i=str.length()-1;
		String str1="";
		while(i>=0)
		{
			str1=str1+str.charAt(i);
			i--;
		}
		
		return str1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(revString(str));
		//System.out.println();

	}

}
