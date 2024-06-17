package sum.of.square.numbers;

//Given a non-negative integer c, decide whether there are two integers a and b such that a^2 + b^2 = c.

//time complexity - O(sqrt(n)^2) = O(n)
//space complexity - O(1)

public class BruteForce {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumSquare(n));
    }

    public static boolean sumSquare(int n) {
        for(int i=1; i*i<n; i++) {
            for(int j=1; j*j<n; j++) {
                if(i*i + j*j == n) {
                    System.out.println("i="+i+":j="+j);
                    return true;
                }
            }
        }
        return false;
    }
}
