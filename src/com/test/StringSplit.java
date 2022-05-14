package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplit {

    public static void main(String[] args) {
        System.out.println("Enter name");
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        int a = scan.nextInt();
        while(a-- >0){

        }
        s = s.trim();
        if(s.isEmpty()){
            System.out.println("size zero "+0);
            return;

        }
        //? matches zero or one time
        //* matches zero or more time
        // + matches one or more time
        //j? means j is optional may be present or may not
        String[] tokens = s.split("[\\s!,?._'@]+");
        System.out.println(tokens.length);
        for(String token: tokens){
            System.out.println(token);

        }
        // Write your code here.
        scan.close();
    }
    }

