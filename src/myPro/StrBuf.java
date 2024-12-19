package myPro;
import java.util.*;
public class StrBuf {

	public static void main(String[] args) {
//		int a[]= {1,2,3};
//		System.out.println(a[0]);
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		
		int u[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur array:");
		
		for(int i=0;i<u.length;i++) {
			//it will take dynamic value
			u[i]=sc.nextInt();
		}
		
		for(int i=0;i<u.length;i++) {
			System.out.print(u[i]+" ");
		}
	}
	}


