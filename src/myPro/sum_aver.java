package myPro;
import java.util.*;
public class sum_aver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter ur Limit:");
		int n=in.nextInt();
		int sum=0;
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter ur "+i+" is:");
			int a=in.nextInt();
			sum+=a;
		}
		System.out.println("the sum of ur gn no is: "+sum);
		System.out.println("the avg of ur gn no is: "+sum/n);
	}

}
