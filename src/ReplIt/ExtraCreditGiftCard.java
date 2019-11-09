package ReplIt;

import java.util.Scanner;

public class ExtraCreditGiftCard {
    public static void main(String[] args) {


//        int giftCard = 100;
//        int times = 3;
//        int spent = 0;
//        while (giftCard >= 0) {
//            System.out.println("Enter cost of item:");
//            int itemPrice = input.nextInt();
//
//            if (itemPrice <= giftCard) {
//                spent += itemPrice;
//                times--;
//                if (spent == 100) {
//                    times++;
//                    System.out.println("You bought " + times + " items, spent $" + spent + " and done shopping");
//                    break;
//                } else if (times == 0) {
//                    System.out.println("You bought 3 items, spent $" + spent + " and done shopping");
//                    break;
//                }
//                System.out.println("You spent $" + spent + " so far" + "\n" + "You may buy up to " + times + " items");
//                giftCard -= itemPrice;
//            } else {
//                System.out.println("You can't spend more than $100");
//            }
//
//
//        }
//
//
//    }
//}

        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while (count < 4 && sum < 100) {
            System.out.print("Enter cost of item: ");
            int cost = input.nextInt();
            sum += cost;
            count++;
            if (sum > 100) {
                System.out.println("You can't spend more than $100");
                sum = sum - cost;
                count--;
                continue;
            }
            if (count < 3 && sum < 100) {
                System.out.println("You spent $" + sum + " so far");
                System.out.println("You may buy up to " + (3 - count) + " items");
            }
            if (sum == 100) {
                System.out.println("You bought " + count + " items, " + " spent $100 and done shopping");
                break;
            }
            if (count == 3) {
                System.out.println("You bought 3 items, spent $" + sum + " and done shopping");
                break;
            }
        }
    }
}
