package finonacci;

// 피보나치 수열이란
// 시작은 0과 1로 이루어져있고
// n-2번째와 n-1를 더한 값이 n이 다.
// 이러한 배여을 더한값이다.



public class Demo {

    public static int fibo(int n) throws Exception {

        if(n < 1){
            throw new Exception("error ");
        }

        if(n == 1 || n == 2){
            return n-1;
        }else{
            return fibo(n-1) + fibo(n-2);
        }


    }

    // 0, 1, 1, 2, 3, 5
    public static void main(String[] args) throws Exception {
        System.out.println(fibo(6));
    }

}



// Recursion vs Iteration
//                      particulars          | Recursion | iteration
// Space efficient                           |    NO     |    Yes
// Time efiicient                            |    NO     |    YES
// Ease of code(to slove sub-problem)        |   Yes     |    NO








