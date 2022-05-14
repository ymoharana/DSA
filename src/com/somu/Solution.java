package com.somu;

import java.util.Scanner;

public class Solution {

    /*public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        College [] colleges = new College[n];

        for(int i=0; i<colleges.length; i++){
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            int contactNo = scanner.nextInt();
            scanner.nextLine();
            String address = scanner.nextLine();
            int pincode = scanner.nextInt();
            colleges[i] = new College(id, name,contactNo,address,pincode);
        }

        scanner.nextLine();
        String searchAddress = scanner.nextLine();


        College result1 = findCollegeWithMaximumPincode(colleges);

        if(null != result1){

            System.out.println("id "+result1.getId());
            System.out.println("name "+result1.getName());
            System.out.println("contactNo "+result1.getContactNo());
            System.out.println("address "+result1.getAddress());
            System.out.println("pincode "+result1.getPincode());

        }else{
            System.out.println("No college found with mentioned attribute");
        }

        College result2 = searchCollegeByAddress(colleges, searchAddress);
        if(null != result2){

            System.out.println("id "+result2.getId());
            System.out.println("name "+result2.getName());
            System.out.println("contactNo "+result2.getContactNo());
            System.out.println("address "+result2.getAddress());
            System.out.println("pincode "+result2.getPincode());

        }else{
            System.out.println("No college found with mentioned attribute");
        }
    }*/

    private static College searchCollegeByAddress(College[] colleges, String searchAddress) {
        College searchedCollege = null;

        for(int i=0; i< colleges.length; i++){
            if(colleges[i].getAddress().equalsIgnoreCase(searchAddress)){
                searchedCollege = colleges[i];
            }

        }

        if(null != searchedCollege){
            return searchedCollege;
        }else{
            return null;
        }

    }

    private static College findCollegeWithMaximumPincode(College[] colleges) {

        int max = Integer.MIN_VALUE;
        College result = null;

        for(int i=0; i<colleges.length; i++){
            if(colleges[i].getPincode() > max)
            {
                result = colleges[i];
                max = colleges[i].getPincode();
            }
        }

     if(null != result){
         return result;
      }
      else{
         return null;
      }

    }
}
