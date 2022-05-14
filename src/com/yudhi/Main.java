package com.yudhi;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        int originalNumber =153;
        int number=originalNumber;
       int sum = 0;
        int len = String.valueOf(originalNumber).length();
       while(number >0){
           int rem = number%10;
           sum += Math.pow(rem, len);
           number /=10;
       }

     if(originalNumber == sum){
         System.out.println("is a amstrong number");

     }else{
         System.out.println("not a amstrong number");
     }
    }

   /* public static String reverse(String input){
        char [] charArray = input.toCharArray();
        char [] reverse = new char[charArray.length];
        for(int i=charArray.length-1, j=0; i>=0 && j<=charArray.length-1; i--,j++){
            reverse[j] = charArray[i];
        }
        return Arrays.toString(reverse);
    }*/

    public static String reverse(String input){
        String [] str = input.split(" ");
        StringJoiner join = new StringJoiner(" ");
        if(null == input || input.isEmpty()){
            return input;
        }
        for(int i=0; i<str.length; i++){
            String temp = str[i];
            StringBuilder sb1 = new StringBuilder(temp);
            //str[i] = sb1.reverse().toString();
            join.add(sb1.reverse());
        }
        return join.toString();
       /* StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();*/
     /*   for(int i=input.length()-1; i>=0; i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();*/
    }

    public static boolean binarySearch(int [] array, int search){
        int minIndex = 0;
        int maxIndex = array.length-1;

        while(minIndex<=maxIndex){
            int midIndex = (minIndex+maxIndex)/2;
            if(search == array[midIndex]){
                return true;
            }
            else if(search < array[midIndex]){
                maxIndex = midIndex-1;

            }else{
                minIndex = midIndex+1;
            }

        }
        return false;
    }
}
