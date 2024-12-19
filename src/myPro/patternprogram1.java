package myPro;
public class patternprogram1{
	       public static void main(String[] args) {    	   
	    	   int n=5;
	    	   System.out.println("square fill pattern");
	    	   for(int i=0;i<n;i++){
	    	      for(int j=0;j<n;j++){
	    		      System.out.print("* ");
	    		   }System.out.println();
	    	   } 
	    	   System.out.println("square hollow pattern");
	    	   for(int i=1;i<=n;i++){
	     	      for(int j=1;j<=n;j++){
	     	    	  if(i>1 && j<n && i<n && j>1){
	     		      System.out.print("  ");
	     	    	  }
	     	    	  else {
	     	    		 System.out.print("* ");
	     	    	  }
	     	    	  }System.out.println();  	    	 
	     	   }
	    	   System.out.println("triangle pattern - all types");
	    	   System.out.println("1.right half");
	    	   for(int i=1;i<=n;i++){ 
	      	      for(int j=1;j<=i;j++){
	      	    	  System.out.print("* ");
	      	      }System.out.println();
	     	   }
	    	   System.out.println("2.reverse right half");
	    	   for(int i=1;i<=n;i++){
	       	      for(int j=1;j<=n-i+1;j++){
	       	    	  System.out.print("* ");
	       	      }System.out.println();
	      	   }
	    	   System.out.println("3.left half");
	    	   for(int i=1;i<=n;i++){
	        	      for(int j=1;j<i;j++){
	        	    	  System.out.print("  ");
	        	      }
	        	      for(int k=1;k<=n-i+1;k++){
	        	    	  System.out.print("* ");
	        	      }System.out.println();
	       	   }
	    	   System.out.println("4.reverse left half");
	    	   for(int i=1;i<=n;i++){
	        	      for(int j=1;j<n-i+1;j++){
	        	    	  System.out.print("  ");
	        	      }
	        	      for(int k=1;k<=i;k++){
	        	    	  System.out.print("* ");
	        	      }System.out.println();
	    	   }
	    	   System.out.println("5.k pattern");
	    	   for(int i=1;i<=n;i++){
	        	      for(int j=1;j<=n-i+1;j++){
	        	    	  System.out.print("* ");
	        	      }System.out.println();
	       	   }
	    	   for(int i=1;i<=n;i++){ 
	       	      for(int j=1;j<=i;j++){
	       	    	  System.out.print("* ");
	       	      }System.out.println();
	      	   }
	    	   System.out.println("6.Triangle");
	    	   for(int i=1;i<=n;i++){
	     	      for(int j=n-i;j>=1;j--){
	     	    	  System.out.print(" ");
	     	      }
	     	      for(int k=1;k<= i;k++){
	     	    	  System.out.print(k+" ");
	     	      }System.out.println();
	    	   }
	    	   System.out.println("7.hellow diamoand");
	    	   for(int i=1;i<n;i++){
	      	      for(int j=n-i;j>=1;j--){
	      	    	  System.out.print(" ");
	      	      }
	      	      for(int k=1;k<=i;k++){
	      	    	  if(i>2 && k<i && k>1){
	      	    	  System.out.print("  ");
	      	    	  }
	      	    	  else{
	      	    	  System.out.print("* ");
	      	    	  }
	      	      }System.out.println();
	     	   }
	    	   for(int i=1;i<=n;i++){
	      	      for(int j=1;j<i;j++){
	      	    	  System.out.print(" ");
	      	      }
	      	      for(int k=1;k<=n-i+1;k++){
	      	    	if(i>0 && k<n && k>1 && k<n-i+1){
	        	    	  System.out.print("  ");
	        	    }
	        	    else{
	        	    	  System.out.print("* ");
	        	    }
	      	      }System.out.println();
	     	   }
	    	   System.out.println("8.diamond");
	    	   for(int i=1;i<n;i++){
	    		   for(int j=n-i;j>=1;j--){
	    			   System.out.print(" ");
	    		   }
	    		   for(int k=1;k<=i;k++){
	    			   System.out.print("* ");
	    		   }System.out.println();
	    	   }
	    	   for(int i=1;i<=n;i++){
	    		   for(int j=1;j<i;j++){
	    			   System.out.print(" ");
	    		   }
	    		   for(int k=1;k<=n-i+1;k++){
	    			   System.out.print("* ");
	    		   }System.out.println();
	    	   }
	    	   System.out.println("9.rhombus pattern");
	    	   for(int i=1;i<=n;i++){
	    		   for(int j=n-i;j>=1;j--){
	    			   System.out.print(" ");
	    		   }
	    		   for(int k=1;k<=n;k++){
	    			   System.out.print("* ");
	    		   }System.out.println();
	    	   }
	    	   System.out.println("10.hellow triangle pattern");
	    	   for(int i=1;i<=n;i++){
	    		   for(int j=n-i;j>=1;j--){
	    			   System.out.print(" ");
	    		   }
	    		   for(int k=1;k<=i;k++){
	    			   if(i>2 && k<i && k>1 && i<n){
	    			   System.out.print("  ");
	    			   }
	    			   else{
	    				   System.out.print("* ");
	    			   }
	    		   }System.out.println();
	    	   }
	    	   System.out.println("11.zero - one triangle pattern");
	    	   for(int i=1;i<=n;i++){
	      	      for(int j=n-i;j>=1;j--){
	      	    	  System.out.print(" ");
	      	      }
	      	      for(int k=1;k<= i;k++){
	      	    	  if((i+k)%2==0) {
	      	    	  System.out.print("0 ");
	      	    	  }
	      	    	  else {
	      	    	  System.out.print("1 ");
	      	    	  }
	      	      }System.out.println();
	     	   }
	    	   
	    	   


	    	   
	    	   
	}
	}

