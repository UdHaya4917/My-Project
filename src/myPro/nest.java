package myPro;
import java.util.*;
public class nest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n1,n2,n3;
	
		System.out.println("Enter n1: "); 
		n1=in.nextInt();
		System.out.println("Enter n2: ");
		n2=in.nextInt();
		System.out.println("Enter n3: "); 
		n3=in.nextInt();
		
		if(n1>=n2){
			if(n1>=n3){
				System.out.println("n1 is an taller Guy");
				}else{
					System.out.println("n3 is an taller Guy");
					}
			}else{
				if (n2>=n3) {
					System.out.println("n2 is an Taller Guy");
				}else{
					System.out.println("n3 is an Taller Guy");
				}
				
			}
	}

}
