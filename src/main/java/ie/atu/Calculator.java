package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        add();
        subtract();
        multiply();
    }

    public static void add(){
        System.out.println("--Add--");
        System.out.println("Please Enter Your First Number:");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Enter Your Second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The Total is: " + total);

    }

    public static void subtract(){
        System.out.println("--Subtract--");
        System.out.println("Please Enter Your First Number:");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Enter Your Second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The Total is: " + total);
    }

    public static void multiply(){
        System.out.println("--Multiply--");
        System.out.println("Please Enter Your First Number:");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please Enter Your Second Number:");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The Total is: " + total);
    }

}
