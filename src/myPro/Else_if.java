package myPro;
import java.util.*;
public class Else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*91-100 0
		 *81-90 A+
		 *71-80 A
		 *61-70 B+
		 *51-60 B
		 *Below 50 F  */
		int marks;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter your marks");
		marks=in.nextInt();
		
		if(marks>=91 && marks<=100) {
			System.out.println("O Grade");
		}else if(marks>=81 && marks<=90) {
			System.out.println("A+ Grade");
		}else if(marks>=71 && marks<=80) {
			System.out.println("A Grade");
		}else if(marks>=61 && marks<=70) {
			System.out.println("B+ Grade");
		}else if(marks>=51 && marks<=60) {
			System.out.println("B Grade");
		}else if(marks<50){
			System.out.println("FAIL");
		}
		 
	}

}
