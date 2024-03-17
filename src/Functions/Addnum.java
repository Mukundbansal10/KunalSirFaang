package src.Functions;

import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class Addnum {
    static void sum(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int num1 = scan.nextInt();
        System.out.print("enter the second number :");
        int num2 = scan.nextInt();
        sum(num2,num1);
    }
}
