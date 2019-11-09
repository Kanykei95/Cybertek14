package Methods;

import org.w3c.dom.ls.LSOutput;

public class FirstWordSecondWordOverLoad {

    //Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and
    // then the firstWord again
    //> input: “day”, “name”
    //> output: “daynameday”
    //Overload the method above to now accept the two Strings and an integer. The integer given tells you how many
    // times your first word should show up in your new String. Your first words need to always be separated by the
    // second word.
    // > input: “day”, “name”, 3
    //> output: “daynamedaynameday”

    public static void main(String[] args) {
        System.out.println(accept("day","name"));
        System.out.println(accept("day","name",2));
    }

    public static String accept(String word1, String word2) {

        return word1+word2+word1;
    }
    public static String accept(String word1, String word2, int num){

        if(num==0){
            return"";
        }
        String newWord="";

        for(int i=0; i<num; i++){
            newWord+=word1; //concatinate
            //only need this condition with substring
          //  if(i==num-1){
          //      break;
           // }
            newWord+=word2;
        }
        return newWord.substring(0,newWord.length()-word2.length());
    }


}
