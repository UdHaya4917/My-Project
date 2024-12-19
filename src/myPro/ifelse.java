package myPro;
import java.util.*;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner udha = new Scanner(System.in);
		
		System.out.println("Enter ur year: ");
		year=udha.nextInt();
		
		if(year%2==0||( year % 100 == 0 && year % 400 == 0)) {
			
			System.out.println("Year "+year+" is an EVEN Year");
		}
		else {
			System.out.println("Year "+year+" ia an ODD Year");
		}			
	}
}
