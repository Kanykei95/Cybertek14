package ReplIt;

import java.util.Scanner;

public class Cubed {

//        Write a method called cube that asks the user for a number and then prints the cubed value of that number:
//
//        For example:
//
//        Input:
//        5
//
//        Output:
//        125
//
//        hint:
//        cube of a number n = n*n*n
public static void main(String[] args) {

    // method
    cube();

}

    public static void cube()
    {
        //your code here

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int result= 0;
        result=num*num*num;
        System.out.println(result);








    }

}
