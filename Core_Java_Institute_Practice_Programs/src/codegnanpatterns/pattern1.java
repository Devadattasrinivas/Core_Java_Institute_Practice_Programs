package codegnanpatterns;

public class pattern1 {
	  public static void printPattern1(int rows)
	     {
	      for(int i=1;i<=5;i++) {
	    	  for(int j=1;j<=i;j++) {
	    		  System.out.print(j+" ");
	    	  }
	    	  System.out.println();
	      }
    	  System.out.println();

	     }


	      public static void printPattern2(int rows)
		     {
		      for(int i=1;i<=5;i++) {
		    	  for(int j=1;j<=i;j++) {
		    		  System.out.print(i+" ");
		    	  }
		    	  System.out.println();
		      }
	     }
	    	 public static void main(String[] args) {
	         pattern1.printPattern1(5);
	         pattern1.printPattern2(5);

	    	 }		// TODO Auto-generated method stub

	}


