package sum.of.square.numbers;

//Given a non-negative integer c, decide whether there are two integers a and b such that a^2 + b^2 = c.

//The time complexity of this code is O(sqrt(n)) because the loop runs from 1 to sqrt(n).
// The space complexity is also O(sqrt(n)) because the map can store at most sqrt(n) key-value pairs.

import java.util.HashMap;
import java.util.Map;

public class OptimiseApproach {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumSquare(n));
    }

    public static boolean sumSquare(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1; i*i<n; i++) {
            map.put(i*i, 1);
            if(map.containsKey(n-i*i)) {
                System.out.println("i="+i+":j="+((int)Math.sqrt(n - i * i)));
                return true;
            }
        }
        return false;
    }
}
