package src.Functions;

import java.util.Scanner;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
public class Maxmin {
     static void max(int a,int b,int c){
        if(a>b&&a>c) System.out.println("maximum"+a);
        else if (b>a&&b>c) System.out.println("maximum "+b);
        else System.out.println("maximum"+c);
    }
    static void min(int a ,int b ,int c){
        if(a<b&&a<c) System.out.println("minimum"+a);
        else if (b<a&&b<c) System.out.println("minimum "+b);
        else System.out.println("minimum"+c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number");
        int a = scan.nextInt();
        System.out.print("enter the number");
        int b = scan.nextInt();
        System.out.print("enter the number");
        int c = scan.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
}
