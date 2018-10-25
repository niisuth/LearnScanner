package com.First;
import java.util.Scanner;
public class Biodata {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Hello, Siapa namamu? ");
        String name = scan.next();
        //System.out.println("Nama Saya " + name);
        System.out.println();
        System.out.print("Berapa Tinggi Badanmu? ");
        int tinggi = scan.nextInt();
        System.out.println();
        System.out.println("Berapa umurmu? ");
        byte umur = scan.nextByte();
        System.out.println();

        System.out.println("Hello, Nama Saya " + name);
        System.out.println("Tinggi badan Saya " + tinggi);
        System.out.println("Umur saya " + umur);

    }
}
