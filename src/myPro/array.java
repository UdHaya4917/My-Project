package myPro;
import java.util.*;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		/*int a[]= {10,20,30,50};
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(int element : a) {
			System.out.println(element);
		}*/
		int e=0,o=0;
		System.out.println("Enter ur Limit ");
		int n=in.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				e++;
			}
			else {
				o++;
			}	
		}
		System.out.println("even no are "+e);
		System.out.println("odd no are "+o);
	}
}
