package recursion;

import java.util.Arrays;
import java.util.HashMap;

public class practice {
   
    public static void main(String[] args) {

        //--------------------------> case1 : reversing string<-------------------------------------------------------//
    //   String str1 ="pwskill is learning platform";
    //   String str2 ="";
    //   for(int i=str1.length()-1; i>=0; i--){
    //     str2 += str1.charAt(i);
    //   }
    //   System.out.println(str2);

    //----------------------------->case 2 : reversing string--------------------------------------------------//

//     String str1 ="java pw";
//    String arr[] =str1.split(" ");
//    String str2 ="";

//    for(int i=arr.length-1; i>=0;i--){
//     str2 +=arr[i]+" ";

//    }

//    System.out.println(str2);


//-------------------------------------------case 3 : reverse string ------------------------------------------------//

    // String str1 ="pallavee chaubey";
    // String str2 ="";
    

    // for(int i=str1.length()-1; i>=0; i--){
    //     str2 +=str1.charAt(i);
        
    // }

    // System.out.println(str2);

    //-------------------------------------palindrome  check ------------------------------------------------------------//
    // String str1 ="AM";
    // String str2 ="";

    // for(int i=str1.length()-1; i>=0; i--){
    //     str2 +=str1.charAt(i);
    // }
    // if(str1.equals(str2)){
    //     System.out.println("pa;indrome");
            
    // }
    // else
    // System.out.println("not palindrome");

    //-------------------------------------Anagram check------------------------------------------------------------//

    // String str1 = "school master";
    // String str2 ="the classroom";

    // str1 = str1.replace(" ","");
    // str2= str2.replace(" ","");

    // str1 =str1.toLowerCase();
    // str2 = str2.toLowerCase();

    // char [] arr1 = str1.toCharArray();
    // char [] arr2 =str2.toCharArray();

    // Arrays.sort(arr1);
    // Arrays.sort(arr2);

    // if(Arrays.equals(arr1,arr2)){
    //     System.out.println("anagram");

    // }

    //-----------------------------------Reverse of array ---------------------------------------------------------//
    // int[] arr={1,2,3,4};
    // int i =0;
    // int j = arr.length-1;

    // while(i<j){
    //    int temp = arr[i];
    //    arr[i] =arr[j];
    //    arr[j] =temp;
    //    i++;
    //    j--;
    // }

   

    // for(int k:arr){
    //     System.out.println(k);
    // }

    //-----------------------------------------------duplicate element find---------------------------------------------//

    int [] arr ={1,2,2,3};
    int i=0;
    int duplicate=0;

    for( i=1; i<arr.length-1;i++){
        if(arr[i]==arr[i-1]){
            duplicate = i-1;
        }
    }

    System.out.println("duplicate found at  "+ duplicate );
    

















   
    
   





















    }

    
}
