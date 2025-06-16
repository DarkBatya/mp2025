import java.util.Scanner;

public class RemoveBAfterC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = sc.nextLine();

        // Використовуємо regex:
        //   (?<=c)  — позитивний look‑behind: перед поточним символом має стояти 'c'
        //   b       — саме символ, який потрібно видалити
        String result = text.replaceAll("(?<=c)b", "");

        System.out.println("Результат:");
        System.out.println(result);

        sc.close();
    }
}
