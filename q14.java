public class q14 {
    public static int productOfDigits(int n) {
      
        if (n == 0) {
            return 1;
        }

       
        return (n % 10) * productOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int result = productOfDigits(123);
        System.out.println(result);
    }
}



// Output: 6