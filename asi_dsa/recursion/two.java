package recursion;

import java.util.Scanner;

public class two {
    public static int sumOfNatural(int n,int i){
        if(i==n+1){
            return 0;
        }
        if(i%2==0){
            return sumOfNatural(n, i+1)-i;
        }
        else{
            return sumOfNatural(n,i+1)+i;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int i= 1;
        int result = sumOfNatural(n,i);
        System.out.println(result);
    }

    
}
