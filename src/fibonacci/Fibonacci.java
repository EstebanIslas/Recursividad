package fibonacci;


/**
 *
 * @author USUARIO
 */
public class Fibonacci {

    public static void main(String[] args) {
        int limite = 10;

        for (int i = 0; i < limite; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }

    private static int Fibonacci(int num) {
        if (num == 0 || num == 1) {
            return num;
        } else {
            return Fibonacci(num - 1) + Fibonacci(num - 2);
        }
    }
}
