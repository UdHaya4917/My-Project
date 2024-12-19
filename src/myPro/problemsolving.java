package myPro;

public class problemsolving {
	    static int fact(int n){
	    	if(n<=1)
	    		return n;
	    	else
	    		return fact(n-1)+fact(n-2);
	    }
		public static void main(String []arg){
			int n=8;
			System.out.println("factorial program with recursion");
			System.out.println("recursion factorial: "+fact(n));
			System.out.println("factorial program without recursion");
			int fact = 1;
			for(int i=1;i<=n;i++) {
				fact *=i;
			}
			System.out.println("factorial of given number: "+fact);
			System.out.println("fibonacci series program");
			int t,s=1,f=-1;		
			for(int i=0;i<n;i++) {
				t=f+s;
				System.out.println(t);
				f=s;
				s=t;			
			}
			System.out.println("fibonacci series with recursion program");
			
			System.out.println(fact(7));
			
		}
}
