package round1.arraystring;

import utils.PrintUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by xingfeiy on 8/25/16.
 */
public class PascalsTriangle118 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows < 1) {
            return Collections.emptyList();
        }
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        lists.add(previous);
        while (numRows > 1) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < previous.size() - 1; i++) {
                list.add(previous.get(i) + previous.get(i + 1));
            }
            list.add(0, 1);
            list.add(1);
            lists.add(list);
            previous = list;
            numRows--;
        }
        return lists;
    }

    public static void main(String[] args) {
        PrintUtils.print(new PascalsTriangle118().generate(1));
        System.out.println("--------");
        PrintUtils.print(new PascalsTriangle118().generate(2));
        System.out.println("--------");
        PrintUtils.print(new PascalsTriangle118().generate(3));
        System.out.println("--------");
        PrintUtils.print(new PascalsTriangle118().generate(4));
        System.out.println("--------");
        PrintUtils.print(new PascalsTriangle118().generate(5));
        System.out.println("--------");
        PrintUtils.print(new PascalsTriangle118().generate(10));

        int i = 1;
        int value = 10 * (i++); // value = 10
        value = 10 * i; //value = 20;

        int j = 1;
        int value2 = 10 * (++j); //value2 = 20
        value2 = 10 * j; //value2 = 20

        int k = 1;
        k++;
        int value3 = 10 * k; //value3 = 20

        int m = 1;
        ++m;
        int value4 = 10 * m; //value4 = 20

        System.out.println();
    }
}
