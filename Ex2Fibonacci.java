import java.util.Scanner;

public class Ex2Fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, a = 0, b = 1, c = 1;
        boolean pertence = false;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num == 0 || num == 1) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
            return;
        }

        while (c < num) {
            c = a + b;
            a = b;
            b = c;
        }

        if (c == num) {
            pertence = true;
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

    }
}
