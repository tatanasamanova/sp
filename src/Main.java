      import java.util.Scanner;
    public class Main {
        private static int  multiply(int a, int b)
        {
            if (a == 0 || b == 0)
                return 0;
            boolean negative = false;
            if (a < 0) {
                negative = true;
                a = -a;
            }
            if (b < 0) {
                negative = !negative;
                b = -b;
            }
            int result = 0;
            for (int i = 1; i <= a; ++i)
                result += b;
            return negative ? -result : result;
        }
        public static void main(final String[] args) {
            final Scanner scann = new Scanner(System.in);
            System.out.println("Введите первый множитель: ");
            final int a = scann.nextInt();
            System.out.println("Введите второй множитель: ");
            final int b = scann.nextInt();
            System.out.println("Результат умножения: ");
            System.out.println(multiply(a, b));
        }
    }



