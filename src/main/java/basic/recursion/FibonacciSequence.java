package basic.recursion;

/**
 * F1=1,F2=1,Fn=F（n-1）+F（n-2）
 *
 * Created by xingfeiy on 7/11/16.
 */
public class FibonacciSequence {
    public static int fib(int n) {
        return (n == 1 || n == 2) ? 1 : fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
    }
}
