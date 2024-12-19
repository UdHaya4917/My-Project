package myPro;
import java.util.*;
public class nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
		 char status;
		 System.out.println("Enter UR Martial Status:");
		 status = in.next().charAt(0);
		 
		 if (status =='u' || status =='U') {
			 
			 System.out.println("Enter ur Gender M/F:");
			 char gender = in.next().charAt(0); 
			 System.out.println("Enter ur age:");
			 int age = in.nextInt();
			 
			 if((gender=='F' || gender == 'f' ) && age>=25) {
				 System.out.println("u r Eligible for PASSPORT");
			 }else if((gender=='M' || gender == 'm' ) && age>=30) {
				 System.out.println("u r Eligible for PASSPORT");
			 }else {
					 System.out.println("u r Not eligible for Password ");
				 }
		 }else if (status =='M' || status =='m') {
			 System.out.println("u r Eligible for PASSPORT");
		 }
		 else {
			 System.out.println("invalid INPUT");
		 }
	}

}
