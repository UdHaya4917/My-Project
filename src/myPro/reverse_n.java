package myPro;
import java.util.*;
public class reverse_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter ur no");
		int n=in.nextInt();
		int rev=0,rem;
		
		while(n!=0) {//123 12 1
			rem=n%10;//123%10=3 12%10=2 1%10=1
			rev=(rev*10)+rem;//(0*10)+3=3 (3*10)+2=32 (32*10)+1=321
			n=n/10;//123/10=12 12/10=1 0
		}
		System.out.println("the rev is "+rev);

	}

}
