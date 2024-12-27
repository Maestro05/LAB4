class Author {
    private String name;
    private String surname;
    private String birthdate;

    // Конструктор по умолчанию
    public Author() {
        this.name = "";
        this.surname = "";
        this.birthdate = "";
    }

    // Метод для ввода данных автора
    public void input(Scanner scanner) {
        System.out.print("Введите имя автора: ");
        this.name = scanner.nextLine();
        System.out.print("Введите фамилию автора: ");
        this.surname = scanner.nextLine();
        System.out.print("Введите дату рождения (DD.MM.YYYY): ");
        this.birthdate = scanner.nextLine();
    }

    // Геттеры
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getBirthdate() {
        return this.birthdate;
    }

    // Метод для вывода данных автора
    public void print() {
        System.out.println("Автор: " + name + " " + surname + ", Дата рождения: " + birthdate);
    }
}