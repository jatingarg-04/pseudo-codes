public class q13 {

   
    public static void fun(int n) {
        if (n == 0) {
            return;
        }

       
        fun(n - 1);
        fun(n - 1);

        
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(2);
    }
}

// Output:1
// 1
// 2
