package factorialEx;

public class Demo {


    public static int factorial(int n){
        if(n <= 1){
            return n;
        }

        return n*factorial(n-1);
    }

    // 5 4 3 2 1
    // (((1 *2) * 3) * 4) * 5)

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }



}
