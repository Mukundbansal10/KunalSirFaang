package src.Functions;

import java.util.Scanner;
//Define a method that returns the product of two numbers entered by user.


public class ProductNum {
    static void product(int a,int b){
        System.out.println("product is :"+a*b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int num1 = scan.nextInt();
        System.out.print("enter the second number :");
        int num2 = scan.nextInt();
        product(num2,num1);
    }
}
