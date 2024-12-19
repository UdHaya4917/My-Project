package myPro;
import java.util.*;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			 System.out.println("Enter ur value of n["+i+"]: ");
			 a[i]=in.nextInt();
		 }
		 int e=0,o=0;
		 for(int element : a) {
		 if(element%2==0) {
			 e++;
		 }else {
			 o++;
		 	}
		 } 
		 System.out.println("the even no are: "+e);
		 System.out.println("the odd no are: "+o);
	}

}
