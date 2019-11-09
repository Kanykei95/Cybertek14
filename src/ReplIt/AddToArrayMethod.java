package ReplIt;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArrayMethod {
    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }

    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        //String [] newArr = new String[arr.length + 1];
//        int[] new_r;
//        new_r = Arrays.copyOf(r, r.length+1);
//        new_r[new_r.length-1]=n;
//
//        System.out.println(Arrays.toString(new_r));
        int[] new_r = new int[r.length+1];
        for (int i=0; i<r.length; i++) {
            new_r[i]=r[i];
        }
        new_r[new_r.length-1]=n;
        for (int i=0; i<new_r.length; i++) {
            System.out.println(new_r[i]);
        }



    }

}

