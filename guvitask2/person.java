package guvitask2;
//properties
public class person { // class name person 
	private String name; 
	private int age;
// methods dis and play has been declared as function
	public void dis() 
	{
		System.out.println("NAME :"+name);
	}
	public void play() {
		System.out.println("AGE :"+age);
	}
	public static void main(String[] args) {
		//creating Instance of class
		person name1 =new person();// name 1 object 1
		person age1 = new person();//age 1 object 2
		//
		name1.name="Banupriya";
		age1.age=18;
		//using methods 
		name1.dis();
		age1.play();
	}
}