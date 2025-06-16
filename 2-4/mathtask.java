import java.util.Scanner;

public class mathtask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 12;
        double[] A = new double[N];
        
        // 1. Зчитуємо 12 значень у масив
        System.out.println("Введіть 12 чисел (через Enter):");
        for (int i = 0; i < N; i++) {
            System.out.printf("A[%d] = ", i);
            A[i] = scanner.nextDouble();
        }
        
        // 2. Обчислюємо середнє значення
        double sum = 0;
        for (double v : A) {
            sum += v;
        }
        double mean = sum / N;
        
        // 3. Обчислюємо суму абсолютних відхилень
        double sumAbsDev = 0;
        for (double v : A) {
            sumAbsDev += Math.abs(v - mean);
        }
        
        // 4. Виводимо результати
        System.out.printf("Середнє значення = %.4f%n", mean);
        System.out.printf("Сума абсолютних відхилень = %.4f%n", sumAbsDev);
        
        scanner.close();
    }
}
