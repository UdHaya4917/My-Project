package myPro;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		 int f=0;
		 for(int n=100;n<=199;n++) {
			 for(int i=1;i<=n;i++) {
					if(n%i==0) {
						f++;
					}
					
				}if(f==2) {
					System.out.println(n+" is a prime");
				}f=0;
		 }
		
	}

}
