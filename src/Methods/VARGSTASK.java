package Methods;

import java.util.Arrays;

public class VARGSTASK {

    //Create a method that will accept an int array. Add up all the numbers in your array, except for numbers that
    // end with 5.

    //Overload your method to take an int array and a number. Now return the sum of all the numbers, except for
    // the numbers that end with the given number.

    public static void main(String[] args) {
        System.out.println(task(2,1,3,4,5,6));
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(task(arr,4));

    }


    public static int  task(int ... arr){
        Arrays.sort(arr);
        int total = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%10!=5){
                total+=arr[i];

            }
        }
        return total;

    }
    public static int task(int [] arr, int num){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%10!=num){
                total+=arr[i];

            }
        }
        return total;
    }
}
