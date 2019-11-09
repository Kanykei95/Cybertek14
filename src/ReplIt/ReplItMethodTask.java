package ReplIt;

import java.util.Scanner;

public class ReplItMethodTask {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int n = inp.nextInt();

            // method
            sign(n);

        }

        public static void sign(int n){
            //your code here
            if(n==0){
                System.out.println(0);

            }else if (n>0){
                System.out.println(1);
            }else if (n<0){
                System.out.println(-1);
            }

        }

    }

