package String;
import java.util.Scanner;
public class PrintAllSubString {

	static void printSubstring(String str)
	{
		int n = str.length();
		for(int start=0; start<n ;start++)
		{
			for(int end=start; end<n; end++)
			{
				System.out.print(str.substring(start, end+1)+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printSubstring(str);

	}

}
