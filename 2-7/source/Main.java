public class Main {
    public static void main(String[] args) {
        PrintedEdition[] editions = new PrintedEdition[] {
            new Magazine("Time"),
            new Newspaper("The New York Times"),
            new Magazine("National Geographic"),
            new Newspaper("The Guardian")
        };

        // Вивід типу, назви та періодичності для кожного елемента
        for (PrintedEdition ed : editions) {
            System.out.println(
                ed.getType() + ": " +
                ed.getName() + ", Periodicity: " +
                ed.getPeriodicity()
            );
        }
    }
}
