package Methods;

public class RIVERSEMETHOSPRACTICE {
    //Create a method that takes a String, it will print the first characters
    //Then overload the method to take a String, and an index. And print the character found at that index
    //then overload the method to take a String and two numbers.Take the substring of the String based on the two
    // numbers provided. Return the length of the substring
    public static void main(String[] args) {
       //printString("hello",3);
        int a = printString("hello",0,3);
        System.out.println(a);
    }

    public static void printString (String str){
        System.out.println(str.charAt(0));
    }

    public static void printString (String str, int index){//void, sout
        System.out.println(str.charAt(index));
    }

    public static int printString(String str,  int indexOne, int indexTwo){//return
        return str.substring(indexOne,indexTwo).length();
    }

}