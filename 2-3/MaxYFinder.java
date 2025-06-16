import java.util.Scanner;

public class MaxYFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Зчитуємо x і b
        System.out.print("Введіть x: ");
        double x = in.nextDouble();
        System.out.print("Введіть b: ");
        double b = in.nextDouble();

        double aStart = 1.0;
        double aEnd   = 2.0;
        double h      = 0.2;

        double yMax = Double.NEGATIVE_INFINITY;
        double aMax = aStart;

        // 2. Перебір a
        for (double a = aStart; a <= aEnd + 1e-9; a += h) {
            // 3. Обчислюємо z та y
            double z = Math.pow(x, 5) + a * x + Math.pow(b, 3);
            double y = Math.pow(Math.cos(z + a), 3) - x;

            // 4. Слідкуємо за максимумом
            if (y > yMax) {
                yMax = y;
                aMax = a;
            }
        }

        // 5. Вивід результатів
        System.out.printf("Найбільше y = %.6f досягається при a = %.1f%n", yMax, aMax);

        in.close();
    }
}