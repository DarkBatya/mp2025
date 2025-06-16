import java.util.Scanner;

public class ConditionalFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення значень
        System.out.print("Введіть значення a: ");
        double a = scanner.nextDouble();

        System.out.print("Введіть значення m: ");
        double m = scanner.nextDouble();

        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();

        double g;

        // Обчислення g
        if (a < m) {
            g = a * Math.pow(m, 2);
        } else {
            g = Math.pow(m, 3) + Math.exp(-a * m);
        }

        // Обчислення y за умовами
        double y;
        if (x == g) {
            y = x;
        } else {
            y = 2 - (Math.pow(x, 2) / 9) - g;
        }

        // Виведення результатів
        System.out.printf("g = %.6f\n", g);
        System.out.printf("y = %.6f\n", y);
    }
}
