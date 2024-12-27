package codegnan;
import java.util.Scanner;

public class ArmStrong {
    public static boolean armstrong(int number){
        int power = (number+"").length();
        System.out.println(power+" power");
        int originalnumber=number;
        double sum=0;

        while(number>0){
            int rem=number%10;
           sum=sum+Math.pow(rem,power);
           // sum=sum+Math.pow(rem,3);
            number=number/10;
        }
            return originalnumber==sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        boolean res= ArmStrong.armstrong(number);
        if(res==true){
            System.out.println("armstrong number");
        }else{
            System.out.println("not a armstrong number");
        }


    }
}
