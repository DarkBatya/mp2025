public class Magazine extends PrintedEdition {
    // Конструктор без параметрів
    public Magazine() {
        super("Unknown Magazine", "Magazine");
    }

    // Конструктор з параметром назви
    public Magazine(String name) {
        super(name, "Magazine");
    }

    @Override
    public String getPeriodicity() {
        return "Monthly";  // щомісяця
    }
}

