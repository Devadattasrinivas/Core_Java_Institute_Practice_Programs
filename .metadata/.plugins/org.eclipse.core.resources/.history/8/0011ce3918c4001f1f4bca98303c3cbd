package codegnan;

public class StrongNumber {
    public static int fact(int number){
         if(number==0 || number==1)
        //if(number<=1)
            return 1;
        return (number)*(number-1);
    }
    public static boolean  checkStrong(int number){
        int originalnumber=number;
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum=sum+fact(rem);
            number=number/10;
        }
        System.out.println(sum);
        return sum==originalnumber;
    }
    public static void main(String[] args) {
       boolean status= checkStrong(145);
       if(status==true){
           System.out.println("strong number");
       }else{
           System.out.println("not a strong number");
       }

    }
}
