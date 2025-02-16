package guvitask2;
import java.util.Scanner;
public class account {
  	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);        //scanner object is sc here
		bankaccount welcome=new bankaccount();     //bankaccount default constructor object is welcome 
	    bankaccount account1 = new bankaccount(" PRIYAROSE","01"); //bankaccount parameterized constructor object is bank1
	    account1.display();                                   //using bank1 object to get a method display
  	}

}
class bankaccount{             //class name bankaccount
	int balance;
	//instance variables
	String customername;
	String customerID;
	int previoustransaction;
	//default constructor
	bankaccount(){                
		System.out.println(" Welcome To INDIAN BANK ");
	}
	//Parameterized constructor
	bankaccount(String name,String id){
		customername=name;              //assign name and id for customer 
		customerID=id;
	}       
	//deposit method
	void deposit(int amount) {
		if(amount!=0) {
			balance=balance+amount;
			previoustransaction=amount;
		}
	}
	//withdraw method
	void withdraw(int amount) {
		if(amount!=0) {
			balance=balance-amount;
			previoustransaction=-amount;
		}
	}
	//previous transaction method
	void getprevioustransaction() {
		if(previoustransaction >0) {
			System.out.println("deposited : "+previoustransaction);
		}
		else if(previoustransaction <0){
			System.out.println("withdraw : "+Math.abs(previoustransaction));
		}else {
			System.out.println("No transaction is occured");
		}
	}
	// method to display 
	void display() {
		char option='\0';                              //initializing the char to select the option for user
		Scanner sc =new Scanner(System.in);                  //to get input from user using scanner object sc 
		System.out.println("Welcome "+customername);
		System.out.println("Customer ID : "+customerID);
		//displaying the option 
		System.out.println("");
		System.out.println("A.deposit");
		System.out.println("B.Withdraw");
		System.out.println("C.check balance");
		System.out.println("D.previoustransaction");
		System.out.println("E.Exit");
		
		//using do while loop and switch here to get a options from user
		do {
			System.out.println("===========================");
			System.out.println("Enter the option");
			System.out.println("===========================");
			option =sc.next().charAt(0);
			char ch= Character.toUpperCase(option);   //even user used lowercase to choose option it will convert to uppercase.
	    	switch(option){  
			case 'A' :
				System.out.println("===========================");
				System.out.println("Amount to deposit");
				System.out.println("===========================");
			int amount =sc.nextInt();
			deposit(amount);
			System.out.println("");
			break;
			
			case 'B' :
				System.out.println("===========================");
				System.out.println("amount to withdraw");
				System.out.println("===========================");
				int amount2 =sc.nextInt();
				withdraw(amount2);
				System.out.println("");
				break;
				
			case 'C' :
				System.out.println("===========================");
				System.out.println("balance = "+balance);
				System.out.println("===========================");
				System.out.println("");
				break;
				
			case 'D' :
				System.out.println("===========================");
				getprevioustransaction();
				System.out.println("===========================");
				System.out.println("");
				break;
				
			case 'E' :
				System.out.println("===========================");
				System.out.println("Exit");
				System.out.println("===========================");
				System.out.println("");
				break;
			default :
				System.out.println("Invalid option! Please try again");
				break;				
			}
		}while (option!='E');
	}
}