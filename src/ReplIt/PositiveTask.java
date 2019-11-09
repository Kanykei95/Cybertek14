package ReplIt;

import Methods.ArraysToString;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class PositiveTask {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        //#2 Your code here

        for(int num: arr){
              isPos(3);

        }
    }

    public static void isPos(int num)
    {
     //#1 your code here
      if(num>0){
          System.out.println("Positive");
       }else{
          System.out.println("Not positive");
      }
    }


}

