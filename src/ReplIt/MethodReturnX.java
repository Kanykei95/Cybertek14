package ReplIt;

import Arrays.Scanner5Names;

import java.util.Scanner;

public class MethodReturnX {
    public static void main(String[] args) {
        //max function gets two ints, x and max.
        //x is the test case, max is what we test against.
        //
        //if  x is bigger then max return max
        //in any other case return x.
        //
        //for example:
        //
        //max(1,10)
        //returns 1
        //
        //max(11,5)
        //returns 5
        Scanner input = new Scanner(System.in);
        System.out.println(max(1,10));

    }


    public static int max(int x,int  max) {
        if(x>max){
            return max;

        }else{
            return x;
        }



    }




}
