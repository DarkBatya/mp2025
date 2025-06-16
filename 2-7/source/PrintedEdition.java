public abstract class PrintedEdition {
    private String name;
    private String type;

    // Конструктор без параметрів
    public PrintedEdition() {
        this.name = "Unknown";
        this.type = "PrintedEdition";
    }

    // Конструктор з параметрами
    public PrintedEdition(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Небазований метод отримання назви
    public String getName() {
        return name;
    }

    // Небазований метод отримання типу
    public String getType() {
        return type;
    }

    // Абстрактний метод, що повертає періодичність випуску
    public abstract String getPeriodicity();
}

