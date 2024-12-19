package myPro;

public class sumofpatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
	System.out.println("1 Right triangle");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++)
			System.out.print(" *");
		System.out.println();
	}

	System.out.println("2 reverse right triangle");
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++)
			System.out.print(" *");
		System.out.println();
	}

	System.out.println("3 Left triangle");
	for (int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++)
			System.out.print("  ");
		for(int j=1;j<=i;j++)
			System.out.print("* ");
		System.out.println();
	}

		System.out.println("4 reverse right triangle");	
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++)
			System.out.print("  ");
		for(int j=i;j<=n;j++)
			System.out.print("* ");
		System.out.println();
	}
	
	System.out.println("5 triangle");
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++)
			System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print("* ");
		System.out.println();
	}
	
	System.out.println("6 Reverse Triangle");
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++)
			System.out.print(" ");
		for(int j=i;j<=n;j++)
			System.out.print("* ");
		System.out.println();
	}
	
	System.out.println("7 diamond");
	for(int i=1;i<n;i++) {
		for(int j=i;j<=n;j++)
			System.out.print(" ");
		for(int j=1;j<=i;j++)
			System.out.print(j+" ");
		System.out.println();
	}
	for(int k=1;k<=n;k++) {
		for(int l=1;l<=k;l++)
			System.out.print(" ");
		for(int l=k;l<=n;l++)
			System.out.print(l+" ");
		System.out.println();
	}
	System.out.println("8 k-pattern");
	for(int i=1;i<=n;i++) {
		for(int j=i;j<=n;j++)
			System.out.print(" *");
		System.out.println();
	}
	for(int i=1;i<n;i++) {
		for(int j=1;j<=i;j++)
			System.out.print(" *");
		System.out.println();
	}
	
	System.out.println("9 hill ");
	for(int i=1;i<n;i++) {
		for(int j=i;j<=n;j++)
			System.out.print("  ");
		for(int j=1;j<i;j++)
			System.out.print("* ");
		for(int j=1;j<=i;j++)
			System.out.print("* ");
		
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++)
			System.out.print("  ");
		for(int j=i;j<n;j++)
			System.out.print("* ");
		for(int j=i;j<=n;j++)
			System.out.print("* ");
		
		System.out.println();
	}
	}

}
