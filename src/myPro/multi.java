package myPro;
import java.util.*;
public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter ur 1st value: ");
		int t =in.nextInt();
		System.out.println("enter ur limit: ");
		int n =in.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println(i+" x "+t+ " = "+ (t*i));
		}
	}

}
