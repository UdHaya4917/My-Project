package myPro;

import java.util.Arrays;

public class insertelem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {20,10,35,80,55,90,79,40,60};
		System.out.println("Before Sort "+Arrays.toString(a));
		int ind=6;
		int val=87;
		for(int i=a.length-1;i>ind;i--) {
			a[i]=a[i-1];
		}
		a[ind]=val;
		System.out.println("Ater Sort"+Arrays.toString(a));
	}

}
