import java.util.Scanner;

public class ColumnPositiveMeans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ввід розмірів масиву
        System.out.print("Введіть n (кількість рядків): ");
        int n = sc.nextInt();
        System.out.print("Введіть m (кількість стовпців): ");
        int m = sc.nextInt();

        if (n <= 0 || m <= 0) {
            System.err.println("n і m мають бути додатніми цілими числами.");
            return;
        }

        // 2. Створення та заповнення матриці X
        double[][] X = new double[n][m];
        System.out.println("Введіть елементи масиву X (" + n + "×" + m + "):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("X[%d][%d] = ", i, j);
                X[i][j] = sc.nextDouble();
            }
        }

        // 3. Підготовка для підрахунку сум і лічильників додатних елементів
        double[] sumPos = new double[m];
        int[] countPos = new int[m];

        // 4. Прохід по матриці та накопичення
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                double v = X[i][j];
                if (v > 0) {
                    sumPos[j] += v;
                    countPos[j]++;
                }
            }
        }

        // 5. Обчислення середніх та вивід результату як вектор
        System.out.println("\nСередні арифметичні додатних значень по стовпцях:");
        double[] meanPos = new double[m];
        for (int j = 0; j < m; j++) {
            if (countPos[j] > 0) {
                meanPos[j] = sumPos[j] / countPos[j];
            } else {
                // Якщо в стовпці немає додатних елементів, задамо 0
                meanPos[j] = 0.0;
            }
            System.out.printf("meanPos[%d] = %.4f%n", j, meanPos[j]);
        }

        sc.close();
    }
}