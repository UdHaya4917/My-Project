package myPro;
import java.util.*;
public class ascend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a=new int[] {8,1,-8,20,31,-1,4,3,7};
		int temp;
		System.out.println("Before Sort:"+Arrays.toString(a));
		for (int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("after Sort:"+Arrays.toString(a));
	}
}