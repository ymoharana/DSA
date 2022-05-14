package com.test;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        // Complete the function
       boolean yes =  isAnagram("anagram", "margana");
       if(yes){
           System.out.println("is anagram");
       }else{
           System.out.println("Not anagram");
       }
    }

    public static boolean isAnagram(final String A, final String B) {
        if(A.length() != B.length()){
            return false;
        }
        char[] charA = A.toUpperCase().toCharArray();
        char[] charB = B.toUpperCase().toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        for(int k=0; k<charA.length; k++){
            if(charA[k] != charB[k]){
                return false;
            }
        }
       return true;

    }
    }
