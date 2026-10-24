public class PrecedencePuzzleSolver {
    public static void main(String[] args) {

        int a = 8;
        int b = 3;

        boolean result1 = a + b * 2 > 12 && a > b;
        System.out.println("Expression 1 result: " + result1);

        int x = 4;
        int result2 = x++ + 6;
        System.out.println("Expression 2 result: " + result2);

        int m = 5;
        int n = 2;

        boolean result3 = ++m > n * 2 || n == 2;
        System.out.println("Expression 3 result: " + result3);

        int p = 7;
        int q = 4;
      
        boolean result4 = p - q * 2 >= 5 && p < q;
        System.out.println("Expression 4 result: " + result4);
    }
}
