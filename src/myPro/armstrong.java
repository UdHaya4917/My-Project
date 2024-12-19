package myPro;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
			int n=153;
			int temp=n;
			int digit1,digit2,digit3;
			
			digit3=temp%10;
			temp=temp/10;
			
			digit2=temp%10;
			temp=temp/10;
			
			digit1=temp%10;
			temp=temp/10;
			int res = (digit1*digit1*digit1)+(digit3*digit3*digit3)+(digit2*digit2*digit2);
			if (n==res) {
				System.out.println(res+" is an armstrong no");
			}
		
		
		}
		}

