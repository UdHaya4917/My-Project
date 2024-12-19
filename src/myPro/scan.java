package myPro;
import java.util.Scanner;
public class scan {

	public static void main(String[] args) {
		
		Scanner udhaya = new Scanner(System.in);
		
		int age,sno;
		
		System.out.println("Enter name:");
		String name =udhaya.nextLine();
		System.out.println("Enter age:");
		age=udhaya.nextInt();
		System.out.println("Enter ROLL NO:");
		sno =udhaya.nextInt();
		System.out.println("Enter CGPA:");
		float CGPA =udhaya.nextFloat();
		System.out.println("Enter your char:");
		char ch =udhaya.next().charAt(0);
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("Roll no :"+sno);
		System.out.println("CGPA :"+CGPA);
		System.out.println("character :"+ch);
		
		
		
		
	}

}
