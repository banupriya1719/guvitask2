package guvitask2;
import java.util.Scanner;   //scanner initialisation

public class product {
	//static variables
	static int[] pid;
	static int[] price;
	static int[] quantity;
	int totalamount=0;
	//parameterized constructor
	product(int[] pid,int[] price,int[] quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	//methods for find high price and id of it
		public void highpid() {
		int max=0;//702
		int id = 0;
		for(int i=0;i<price.length;i++) {
			if(price[i]>max) {  
				max=price[i];
				id=pid[i];
			}
			}
		System.out.println("pid ="+id+" highest price : "+max);
		}
		//method for calculating total amount
	public int[] getpid() {
		int singleamount[] = new int[5];
		for(int j=0;j<=5-1;j++) {
			singleamount[j]=price[j]*quantity[j];	
		}
		for(int k=0;k<=singleamount.length-1;k++) {
			totalamount=totalamount	+singleamount[k];
		}
		System.out.println("the total amount = "+totalamount);
		return pid;
	}
	public int[] getprice() {
		return price;
	}
	public int[] getquantity() {
		return quantity;
	}
 public class productmain {
	public static void main(String[] args) {       //main function has been declared here
		Scanner sc= new Scanner(System.in);          //scanner object sc is created
		System.out.println("pid :");            // get array pid[5] as input
		int[] pid= new int[5];
		for(int a=0;a<=5-1;a++) {			
			pid[a]=sc.nextInt();
			}
			System.out.println("Price :");
			int[] price= new int[5];              //get array price[5] as input
			for(int b=0;b<=5-1;b++) {
			price[b]=sc.nextInt();
			}
			System.out.println("Quantity");
			int[] quantity=new int[5];              //get array quantity[5] as input
			for(int c=0;c<=5-1;c++) {
			quantity[c]=sc.nextInt();
			}
			product s1=new product(pid,price,quantity);     //creating a class object s1 and also initalise the default constructor here
			s1.highpid();
			s1.getpid();
	}
		}
}