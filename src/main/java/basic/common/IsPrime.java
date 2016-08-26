package basic.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xingfeiy on 8/7/16.
 */
public class IsPrime {
    public static boolean isPrime(int n) {
        return true;
    }

    public static List<Integer> printPrime(int n) {
        if(n <= 1) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        if(n >= 2) {
            list.add(2);
        }
        if(n >= 3) {
            list.add(3);
        }
        for(int i = 5; i  <= n; i += 6) {
            if(n % i != 0 ) {
                list.add(i);
            }
            if(n % (i + 2) != 0) {
                list.add(i + 2);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        System.out.println(printPrime(100));
    }
}
