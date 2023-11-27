package recursion;

import java.util.Scanner;


public class one {

    public static int sumOfDigit(int n){
        int result =0;
        if(n==0){
            return 0;
        }
        else{
            result =n%10+sumOfDigit(n/10);
        }
        return result;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int result = sumOfDigit(n);
        System.out.println(result);
    }
     

    
}
