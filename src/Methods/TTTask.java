package Methods;

public class TTTask {
    //Create a method that will accept two Strings. Return true if the first string begins with the second String.
    // Return false if it does not.



    //Overload the method to accept a two Strings and a number. Return true if the second String is found inside of
    // your first String the amount of times equal to your number parameter.
    //input: “jamesjajl”,”ja", 2
    //output: true
    public static void main(String[] args) {
        System.out.println(word("kana is nice","kana"));
        System.out.println(word("djamesjajl","ja",2));
    }

    public static boolean word(String str, String str2){
        if(str.toLowerCase().startsWith(str2.toLowerCase())){
            return true;

        }else{
            return false;
        }

    }

    public static boolean word(String str,String str2, int num){
       int count= 0;
        for(int i =0; i<str.length()-str2.length()+1; i++){
            String sub= str.substring(i,i+str2.length());//substring 0,0+length of the second word that statrts.
            if(sub.equals(str2)){
                count++;
            }
        }
        if(num==count)return true;
        return false;
    }
}
