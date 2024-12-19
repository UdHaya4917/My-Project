package myPro;
import java.util.*;
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n;
		int temp;
		int d1,d2,d3;
		for( int i=1;i<=999;i++) {
			temp=i;
			d3=temp%10;
			temp=temp/10;
			
			d2=temp%10;
			temp=temp/10;
			
			d1=temp%10;
			temp=temp/10;
			
			int res=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
			if(i==res) {
				System.out.println(i+" is a Armstrong no");
			}
		}
		
	}
}
