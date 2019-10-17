package Strings;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");

        String accountNumber = input.nextLine();
        String firstNumber = accountNumber.substring(0,1);
        boolean invalid  = firstNumber.equals("5") || !firstNumber.equals("2");

        if (invalid) {
            System.out.println("Invalid account number");
        }else{

            if(firstNumber.equals("5")&&accountNumber.length( )==10){
                System.out.println("valid 5 account");
            } else {
                System.out.println("invalid 5 account");
            }

        }

        if (firstNumber.equals("2")){
            if (accountNumber.length() == 7){
                System.out.println("valid 2 account");
            }else {
                System.out.println("Invalid 2 account");
            }
        }




    }
}
        /////////