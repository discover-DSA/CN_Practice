package String;
//import java.util.Scanner;
public class StringBuffer_Demo {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("abc");
		str.setCharAt(0,'d');
		str.append("xyz");
		System.out.println(str.length());
		System.out.println(str);

	}

}
