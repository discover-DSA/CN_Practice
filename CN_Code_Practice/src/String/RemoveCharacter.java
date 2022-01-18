package String;
import java.util.Scanner;
public class RemoveCharacter {
	static String remChar(String str, char ch)
	{
		String temp = ""; String old= str;
		for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==ch)
            {
            	continue;
            }
            else
            {
            	temp=temp+str.charAt(i);
            }
            
            
                
        }
        if(temp.length()>0)
        {
        	str = temp;
        	return str;
        }
        else if(old==str)
        {
        	return "";
        }
        else
        	return str;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char  ch = sc.next().charAt(0);
		System.out.println(remChar(str, ch));
		

	}

}
