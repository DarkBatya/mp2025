import java.util.Scanner;

public class ComputeZ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Зчитуємо вхідні дані
        System.out.print("Введіть a (>0): ");
        double a = in.nextDouble();

        System.out.print("Введіть α (в градусах): ");
        double alphaDeg = in.nextDouble();

        System.out.print("Введіть c (>= 3): ");
        double c = in.nextDouble();

        // Перевірки вхідних даних
        if (a <= 0) {
            System.err.println("Помилка: a має бути > 0.");
            return;
        }
        if (c < 3) {
            System.err.println("Помилка: c має бути >= 3.");
            return;
        }

        // 2. Підготовка до обчислення
        double alphaRad = Math.toRadians(alphaDeg);     // градуси → радіани
        double sqrtTerm = Math.sqrt(Math.log(a) + 1);   // √(ln(a) + 1)
        double denom = 0.25 * Math.sin(alphaRad);       // знаменник

        if (denom == 0.0) {
            System.err.println("Помилка: sin(α) = 0, ділення на нуль.");
            return;
        }

        // 3. Заголовок таблиці
        System.out.printf("%5s | %12s%n", "   x", "         z");
        System.out.println("------+--------------");

        // 4. Обчислення в циклі для x = 3…c з кроком 0.5
        double h = 0.5;
        for (double x = 3.0; x <= c + 1e-9; x += h) {
            double z = x * sqrtTerm / denom;
            System.out.printf("%5.2f | %12.6f%n", x, z);
        }

        in.close();
    }
}
