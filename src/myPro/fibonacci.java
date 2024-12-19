package myPro;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter ur no:");
		int n=in.nextInt();
		int a=-1,b=1,c;
		for (int i=1;i<=n;i++) {
			c=a+b;//-1+1=0 1+0=1 0+1=1 1+1=2 1+2=3 2+3=5 3+5=8 
			System.out.println(c);//0 1 1 2 3 5 8 13
			a=b;//1 0 1 1 2 3 5 8
			b=c;//0 1 1 2 3 5 8 13
		}

	}

}
