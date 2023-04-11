package com.ironhack.w1.d1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       System.out.println("Hello World");

       // DATA TYPES
       byte myByte = 127;
       short myShort = 1000;
       int myInt = 999999;
       double myDouble = 10.1234;
       boolean isBoolean = true;
       char myChar ='c';

       String myString = "Hola Ironhack!";
       String myName;
       myName = "Adrián";

        System.out.println("myByte:"+myByte);
        System.out.println("myShort:"+myShort);
        System.out.println("myInt:"+myInt);
        System.out.println("myDouble:"+myDouble);
        System.out.println("myBoolean:"+isBoolean);
        System.out.println("myChar:"+myChar);
        System.out.println("myChar:"+myName);
        System.out.println("myString:" + myString );

        myInt += 1;
        System.out.println("myInt:"+myInt);
        System.out.println();
    }

    public String productFormatter(String productName, String date){
        return productName.trim().replaceAll("\\s", "_").concat(date).toUpperCase();
    }
}