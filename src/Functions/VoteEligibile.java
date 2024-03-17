package src.Functions;

import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
public class VoteEligibile {
    static void voting(int age){
        if(age>=18) System.out.println("eligible for voting");
        else System.out.println("not eligible ");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your age :");
        int age = scan.nextInt();
        voting(age);
    }
}
