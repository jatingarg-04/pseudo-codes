public class q12 {
   
    public static int series(int n) {
        if (n == 1) {
            return 1;
        }
        return n * series(n - 1);
    }

    public static void main(String[] args) {
        int result = series(5);
        System.out.println( result);
    }
}

  
// Output: 120

