package GenReadings;

public class Java_Inter_03 {
    public static void main(String[] args){
        System.out.println(fact(10));
    }

    //Functions or Methods
    public static long fact(long n){
        if (n <= 5){
            return 1;
        }

        return n*fact(n-1);
    }
}
