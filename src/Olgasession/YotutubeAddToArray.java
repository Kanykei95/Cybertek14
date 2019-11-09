package Olgasession;

import java.util.Scanner;

public class YotutubeAddToArray {
    public static void main(String[] args) {

        int sum=0;
        //Create a sccanner objects for taking inout
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of the elements");


        //Take the number of elemtns and store it
        int n = s.nextInt();

        //create an array of size=n

        int array[] = new int [n];

        System.out.println("Enter the elements in an array");

        for(int i=0; i<n; i++){
            array[i]=s.nextInt();

        }

        //10 20 30
        for (int i: array){
            sum=sum+i;
        }
        System.out.println("sum=" +sum);
    }
}
