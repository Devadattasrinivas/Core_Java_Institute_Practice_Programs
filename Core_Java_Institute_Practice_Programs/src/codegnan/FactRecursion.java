package codegnan;
class factorial{
    public static int fact(int number){
       // if(number==0 || number==1)
        if(number<=1)
            return 1;
        return (number)*(number-1);
    }

}
public class FactRecursion {
    public static void main(String[] args) {
      //  factorial.fact(5);
        System.out.println(factorial.fact(3));

    }
}
