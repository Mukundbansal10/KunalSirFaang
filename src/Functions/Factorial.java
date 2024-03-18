package src.Functions;

import java.util.Scanner;

class Factorial {
    void fact(int n) {
        int a = 1;
        for (int index = n; index > 0; index--) {
            a *= index;
        }
        System.out.println("a = " + a);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number :");
        int n = scan.nextInt();
        Factorial factorial = new Factorial();
        factorial.fact(n);
    }
}
