package codegnan;

public class pyrmidpattern {
	public static void printPyramid(int rows)
    {
     for(int i=1;i<=5;i++) {
    	 for(int space=1;space<=rows-i;space++) {
      		  System.out.print(" ");

    	 }
   	  for(int j=1;j<=i;j++) {
   		  System.out.print("* ");
   	  }
   	  System.out.println();
     }
     
    }
	
	public static void printNumberPyramid1(int rows) {
		for(int i=1;i<=5;i++) {
	    	 for(int space=1;space<=rows-i;space++) {
	      		  System.out.print(" ");

	    	 }
	   	  for(int j=1;j<=i;j++) {
	   		  System.out.print(j+" ");
	   	  }
	   	  System.out.println();
	     }
	}
    public static void printNumberPyramid2(int rows) {
    	for(int i=1;i<=5;i++) {
       	 for(int space=1;space<=rows-i;space++) {
         		  System.out.print(" ");

       	 }
      	  for(int j=1;j<=i;j++) {
      		  System.out.print(i+" ");
      	  }
      	  System.out.println();
        }
	}

	public static void main(String[] args) {
		pyrmidpattern.printPyramid(6);
		pyrmidpattern.printNumberPyramid1(7);
		pyrmidpattern.printNumberPyramid2(5);

	}

}
