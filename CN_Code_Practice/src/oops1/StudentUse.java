package oops1;

//import Students;
public class StudentUse {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		 
		Students s1 = new Students();// creating a new object which will have all the properties as defined in Students class
		Students s2 = new Students();  //s1 and s2 are the references to the object
		
		//System.out.println(s1); //s1 is stored in stack mem and objects will be stored in heap mem
		s1.name="Amit";
		s1.setRollNumber(1);
		//s1.getRollNumber();
		s2.name="Akash";
		s2.setRollNumber(2);
		//s2.getRollNumber();
		System.out.println(s1.name +" "+ s1.getRollNumber());
		System.out.println(s2.name +" "+s2.getRollNumber());

	}

}
