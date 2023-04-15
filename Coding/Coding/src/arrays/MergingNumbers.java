package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergingNumbers {
    static class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Interval arr[] = new Interval[4];
        arr[0] = new Interval(1, 3);
        arr[1] = new Interval(2, 4);
        arr[2] = new Interval(6, 8);
        arr[3] = new Interval(9, 10);

        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        Stack<Interval> result = new Stack<>();
        result.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Interval fst = result.peek();
            Interval snd = arr[i];

            //Condition For Non Overlapping elements
            if (fst.end < snd.start) {
                result.push(snd);

            } else if (fst.end < snd.end) {
                result.pop();
                fst.end = snd.end;
                result.push(fst);
            }
        }

        while (!result.isEmpty())
        {
            Interval t = result.pop();
            System.out.print("["+t.start+","+t.end+"] ");
        }

    }
}
