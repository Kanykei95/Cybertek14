package Methods;

public class DataTypePromotion {

    public static void main(String[] args) {
        int a = 45;
        int b = 5;
        calc(a);
        calc(b);
    }

    public static void calc(byte i){
        System.out.println("using int");
    }

    public static void calc(long d){
        System.out.println("using long");
    }

    public static void calc(float f){
        System.out.println("using float");
    }


}
