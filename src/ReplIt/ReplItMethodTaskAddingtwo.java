package ReplIt;

import java.util.Scanner;

public class ReplItMethodTaskAddingtwo {
    //Create a static method called "plus", its return is void and it gets no arguments.
    //
    //It asks the user to input two numbers, then it will add them and print the result.
    //Create a scanner within plus method.
    //
    //Example:
    //
    //Enter first number:
    //1
    //Enter second number:
    //2
    //result: 3
    public static void main(String[] args) {

        plus();
    }

    public static void plus(){

        //your code here
        Scanner input = new Scanner(System.in);



        System.out.println("Enter first number: ");
        int input1= input.nextInt();
        System.out.println("Enter second number: ");
        int input2 = input.nextInt();
        int result= input1+input2;
        System.out.println("result:" +result);

    }

}

