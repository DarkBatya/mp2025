import java.util.Scanner;

public class TrigIdentityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть α (в радіанах): ");
        double alpha = scanner.nextDouble();

        // z1
        double numerator = Math.sin(2 * alpha) + Math.sin(5 * alpha) - Math.sin(3 * alpha);
        double denominator = Math.cos(alpha) - Math.cos(3 * alpha) + Math.cos(5 * alpha);
        double z1 = numerator / denominator;

        // z2
        double z2 = Math.tan(3 * alpha);

        // Вивід результатів
        System.out.printf("Z1 = " + z1);
        System.out.printf("Z2 = " + z2);

        scanner.close();
    }
}
