package com.enums;

public enum TryEnumAsClass {
    INSTANCE;
    private String name;
    TryEnumAsClass(){
        System.out.println("Constroctor");
        name="yudhi";
    }
   public String getName(){
        return INSTANCE.name;
   }
//   public static void initialize(String myName){
   //     name = myName;
  // }
//    public static void main(String[] args) {
//        TryEnumAsClass in = TryEnumAsClass.INSTANCE;
//        TryEnumAsClass in2 = TryEnumAsClass.INSTA;
//        System.out.println(in.name);
//        System.out.println("=====");
//        System.out.println(in2.name);
//        System.out.println(TryEnumAsClass.values());
//    }

}
