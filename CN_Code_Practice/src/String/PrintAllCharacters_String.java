package String;
import java.util.Scanner;
public class PrintAllCharacters_String {

	static void printCharacters(String str)
	{
		int i=0;
		int count=0;
		while(i<str.length())
		{
			System.out.print(str.charAt(i));
			count++;
			//System.out.print(count);
			i++;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		printCharacters(str);
	}

}	
