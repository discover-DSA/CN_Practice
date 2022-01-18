package String;
import java.util.Scanner;
public class printWordCount_String {
static int wordCount(String str)
{
	int i=0; int count=0;
	while(i<str.length())
    {
        if(str.charAt(i)==' ')
        {
            count++;
        }
        i++;
    }
    //if(count>1)
    return count+1;
   // else
    	//return 0;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(wordCount(str));
		

	}

}
