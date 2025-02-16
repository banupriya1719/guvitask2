package guvitask2;
import java.util.Scanner;
public class mainPerson {  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		Employee obj = new Employee(name,age);		
		obj.display();
		obj.displayid();
}
}
class Person {                      //base class 
	private String name;            
	private int age;
	public Person(String name,int age){   //parameterized constructor
		this.name=name;
		this.age=age;
	}
	public void display() {                 //method to display
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
	}
}
class Employee extends Person {          //inheritance happens by creating extends from base class in a sub class
	private int employeeID=1001;
	private double salary=300000;

	public Employee(String name,int age) {   //sub class parameterized constructor
     super(name,age);                        // using super key to call a base class
	}
	public void displayid() {                   
	System.out.println("employeeID :"+employeeID+"\nsalary :"+salary);
}

}
 