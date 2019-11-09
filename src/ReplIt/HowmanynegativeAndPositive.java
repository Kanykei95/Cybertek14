package ReplIt;

import java.util.Scanner;

public class HowmanynegativeAndPositive {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();

        }

        plus_minus(arr);
    }

    public static void plus_minus(int []arr){
        int countPos =0;
        int countNeg = 0;
        int countZeros =0;

    for(int num: arr){
        if(num>0){
            countPos++;
            System.out.println("positive:" + countPos);


        }else if(num<0){
            countNeg++;
            System.out.println("negative: "+ countNeg);


        }else if  (num==0){
            countZeros++;
            System.out.println("zeros: "+ countZeros);
        }
    }





}
}
