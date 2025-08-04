public class q15{
    public static void f(double x) {
        if (x < 1) {
            return;
        }

       
        f(x / 2);

        
        System.out.println((int)x); 
    }

    public static void main(String[] args) {
        f(8);
    }
}
