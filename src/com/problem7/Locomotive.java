package com.problem7;

import java.time.LocalDateTime;

public class Locomotive extends Object{

    public static void main(String[] args) {
       // System.out.println(toUpperCaseString("azxertypqas"));
        //check();
        LocalDateTime ld = LocalDateTime.now();
        System.out.println(ld);
        //Double.intValue();

    }

    public static String toUpperCaseString(String input){
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<input.length(); i++){
           int val  = input.charAt(i);
            if(val>=97 && val<=122){
                val -=32;
                sb.append((char)val);
            }else{
                sb.append((char)val);
            }
        }
      return  sb.toString();


    }

    public static void check(){
        for(int i=0; i<10; i++)
            System.out.println("test");
    }

}
