public class Newspaper extends PrintedEdition {
    // Конструктор без параметрів
    public Newspaper() {
        super("Unknown Newspaper", "Newspaper");
    }

    // Конструктор з параметром назви
    public Newspaper(String name) {
        super(name, "Newspaper");
    }

    @Override
    public String getPeriodicity() {
        return "Daily";    // щодня
    }
}

