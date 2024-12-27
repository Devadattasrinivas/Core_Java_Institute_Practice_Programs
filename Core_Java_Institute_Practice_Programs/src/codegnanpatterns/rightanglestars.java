package codegnanpatterns;

public class rightanglestars {
     public static void printPattern(int rows)
     {
      for(int i=1;i<=5;i++) {
    	  for(int j=1;j<=i;j++) {
    		  System.out.print("*"+" ");
    	  }
    	  System.out.println();
      }
    	 
     }
    	 public static void main(String[] args) {
         rightanglestars.printPattern(5);
     
    	 }
}
