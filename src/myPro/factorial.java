package myPro;
import java.util.*;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter ur no: ");
		int n=in.nextInt();
		int j=1;
		for(int i=1;i<=n;i++) {
			j*=i;
			System.out.println("fac of "+i+" is "+j);
		}

	}

}
