public class q11 {
   
    public static int foo(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return foo(n - 1) + foo(n - 2);
    }

    public static void main(String[] args) {
        int result = foo(4);
        System.out.println("foo(4) = " + result);
    }
}

    
// Output: foo(4) = 3
