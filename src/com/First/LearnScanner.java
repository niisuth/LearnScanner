package com.First;
import java.util.Scanner;
public class LearnScanner {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("What's your name?");
        String name = scan.next();
        System.out.println("Hello " + name);
    }
}
