package myPro;
import java.util.*;

public class groupswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 char c;
	 Scanner in= new Scanner(System.in);
	 System.out.println("Enter word");
	 c=in.next().charAt(0);
	 
	 switch(c) {
	 case 'a':
	 case 'e':
	 case 'i':
	 case 'o':
	 case 'u':
		 System.out.println(c+ " is a Vowel");
		 break;
		 
		 default:
			 System.out.println(c  +" not an Vowel");
			 break;
			 
	 }
	 
	}

}
