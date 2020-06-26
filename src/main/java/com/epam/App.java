package com.epam;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        StringOperation stringOperation = new StringOperation();
        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        System.out.println("Result: "+stringOperation.removeAFromString(string));

    }
}
