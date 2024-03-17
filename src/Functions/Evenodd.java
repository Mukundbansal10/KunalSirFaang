package src.Functions;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class Evenodd {
    static void evenodd(int num){
        if(num%2==0) System.out.println("even number");
        else System.out.println("odd number");

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int num = scan.nextInt();
        evenodd(num);
    }
}
