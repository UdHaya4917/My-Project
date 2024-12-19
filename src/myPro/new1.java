package myPro;

public class new1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=5;
	for(int i=1;i<n;i++) {
		for(int j=i;j<=n;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int k=1;k<=n;k++) {
		for(int l=1;l<=k;l++) {
			System.out.print(" ");
		}
		for(int l=k;l<=n;l++) {
		System.out.print("* ");
		}
		System.out.println();
	}
	}
}
