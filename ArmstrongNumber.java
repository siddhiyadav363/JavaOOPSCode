import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isArmstrong(num)){
            System.out.println("An Armstrong number.");
        
        }
        else{
            System.out.println("Not an armstrong number.");
        }
    }
    

    public static boolean isArmstrong(int num){
        int original=num;
        int digits=String.valueOf(num).length();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=Math.pow(digit,digits);
            num/=10;

        }
        return sum==original;
    }
}
