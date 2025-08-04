public class q9 {
    public static int sumDigits(int n) {
        
        if (n == 0) {
            return 0;
        }

        
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 1234;
        int result = sumDigits(number);
        System.out.println(result);
    }
}


// output: 10