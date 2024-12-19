package myPro;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,3,6,6,7,2,7,4};
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if((a[i]==a[j]) && i!=j) {
					
					System.out.println(" the duplicate no is "+ a[j]);
				}
			}
		}

	}

}
