package myPro;

import java.util.Arrays;

public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,0,2,3,0,9};
		int a2[]= {1,9,5,0,6,12,0};
		 int temp;
		 int tem;
		 for(int i=0;i<a.length;i++) {
			 for(int j=i;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
				 
		 }
		 System.out.println(Arrays.toString(a));
		 
		for(int i=0;i<a2.length;i++) {
			for(int j=i;j<a2.length;j++) {
				if(a2[i]>a2[j]) {
				tem=a2[i];
				a2[i]=a2[j];
				a2[j]=tem;
				
				}
				
			}
		}
		System.out.println(Arrays.toString(a2));
	}
	}


