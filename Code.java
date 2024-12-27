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

class Category {
    private String name;
    private String description;

    // Конструктор по умолчанию
    public Category() {
        this.name = "";
        this.description = "";
    }

    // Метод для ввода данных категории
    public void input(Scanner scanner) {
        System.out.print("Введите название категории: ");
        this.name = scanner.nextLine();
        System.out.print("Введите описание категории: ");
        this.description = scanner.nextLine();
    }

    // Геттеры
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    // Метод для вывода данных категории
    public void print() {
        System.out.println("Категория: " + name + ", Описание: " + description);
    }
}

class Book {
    private String title;
    private Author author;
    private Category category;
    private int year;
    private int copiesAvailable;

    // Конструктор по умолчанию
    public Book() {
        this.title = "";
        this.year = 0;
        this.copiesAvailable = 0;
        this.author = new Author();
        this.category = new Category();
    }

    // Метод для ввода данных о книге
    public void input(Scanner scanner) {
        System.out.print("Введите название книги: ");
        this.title = scanner.nextLine();

        this.author.input(scanner);
        this.category.input(scanner);

        System.out.print("Введите год издания: ");
        this.year = scanner.nextInt();
        System.out.print("Введите количество доступных копий: ");
        this.copiesAvailable = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера после ввода числа
    }

    // Методы доступа
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public Category getCategory() {
        return this.category;
    }

    public int getYear() {
        return this.year;
    }

    public int getCopiesAvailable() {
        return this.copiesAvailable;
    }

    // Метод для уменьшения количества доступных экземпляров
    public void decreaseCopies() {
        if (copiesAvailable > 0) {
            --copiesAvailable;
        }
    }

    // Метод для увеличения количества доступных экземпляров
    public void increaseCopies() {
        ++copiesAvailable;
    }

    // Метод для вывода информации о книге
    public void print() {
        System.out.println("Книга: " + title + ", Год: " + year + ", Доступных копий: " + copiesAvailable);
        author.print();
        category.print();
    }
}