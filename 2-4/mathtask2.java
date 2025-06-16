import java.util.Scanner;

public class mathtask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Зчитуємо розмір масиву
        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Розмір масиву має бути додатнім.");
            return;
        }

        int[] A = new int[n];

        // 2. Зчитуємо елементи масиву
        System.out.println("Введіть " + n + " цілих чисел:");
        for (int i = 0; i < n; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = scanner.nextInt();
        }

        // 3. Знаходимо максимальне значення
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        // 4. Рахуємо, скільки разів воно зустрічається
        int count = 0;
        for (int v : A) {
            if (v == max) {
                count++;
            }
        }

        // 5. Виводимо результати
        System.out.printf("Найбільше значення в масиві = %d%n", max);
        System.out.printf("Кількість елементів, що дорівнюють цьому максимуму = %d%n", count);

        scanner.close();
    }
}
