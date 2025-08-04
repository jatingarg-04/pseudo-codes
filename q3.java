public class q3 {
  
    public static int f(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + f(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = f(6);
        System.out.println(result); 
    }
}

    
