import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = sc.nextLine();

        // Розбиваємо на слова: будь‑які не‑літерні символи вважаємо роздільниками
        String[] words = text.split("\\P{L}+");

        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        if (longest.isEmpty()) {
            System.out.println("У введеному тексті не знайдено жодного слова.");
        } else {
            System.out.printf("Найдовше слово: \"%s\" (довжина %d)%n",
                              longest, longest.length());
        }

        sc.close();
    }
}
