import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Базовый класс для всех элементов меню
class MenuItem {
    String name;    // Название блюда
    double price;   // Цена блюда

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " - " + price + " руб.");
    }
}

// Класс для главного блюда
class MainDish extends MenuItem {
    public MainDish(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.print("[Главное блюдо] ");
        super.display();
    }
}

// Класс для закусок
class Appetizer extends MenuItem {
    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.print("[Закуска] ");
        super.display();
    }
}

// Класс для напитков
class Drink extends MenuItem {
    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.print("[Напиток] ");
        super.display();
    }
}

// Класс для десертов
class Dessert extends MenuItem {
    public Dessert(String name, double price) {
        super(name, price);
    }

    @Override
    public void display() {
        System.out.print("[Десерт] ");
        super.display();
    }
}

// Класс для обработки заказа
class Order {
    List<MenuItem> items = new ArrayList<>();  // Список заказанных позиций

    // Добавить элемент в заказ
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Вывести заказ
    public void displayOrder() {
        double total = 0;
        System.out.println("\nВаш заказ:");
        for (MenuItem item : items) {
            item.display();
            total += item.price;
        }
        System.out.println("Общая сумма: " + total + " руб.");
    }
}

public class Main {
    // Метод для отображения главного меню
    public static void displayMenu() {
        System.out.println("\nВыберите категорию меню:");
        System.out.println("1. Главное блюдо");
        System.out.println("2. Закуски");
        System.out.println("3. Напитки");
        System.out.println("4. Десерты");
        System.out.println("5. Завершить заказ");
        System.out.print("Введите номер категории: ");
    }

    // Метод для отображения главных блюд
    public static void displayMainDishes() {
        System.out.println("\nГлавные блюда:");
        System.out.println("1. Борщ - 150 руб.");
        System.out.println("2. Стейк - 300 руб.");
        System.out.println("3. Пельмени - 180 руб.");
        System.out.println("4. Ризотто - 220 руб.");
    }

    // Метод для отображения закусок
    public static void displayAppetizers() {
        System.out.println("\nЗакуски:");
        System.out.println("1. Салат Цезарь - 120 руб.");
        System.out.println("2. Оливье - 100 руб.");
        System.out.println("3. Блины с икрой - 150 руб.");
        System.out.println("4. Тосты с авокадо - 110 руб.");
    }

    // Метод для отображения напитков
    public static void displayDrinks() {
        System.out.println("\nНапитки:");
        System.out.println("1. Кола - 50 руб.");
        System.out.println("2. Минеральная вода - 40 руб.");
        System.out.println("3. Сок апельсиновый - 70 руб.");
        System.out.println("4. Чай черный - 60 руб.");
    }

    // Метод для отображения десертов
    public static void displayDesserts() {
        System.out.println("\nДесерты:");
        System.out.println("1. Торт Наполеон - 80 руб.");
        System.out.println("2. Мороженое - 60 руб.");
        System.out.println("3. Чизкейк - 120 руб.");
        System.out.println("4. Пирог с яблоками - 90 руб.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Создание объектов для главных блюд
        MainDish[] mainDishes = {
            new MainDish("Борщ", 150),
            new MainDish("Стейк", 300),
            new MainDish("Пельмени", 180),
            new MainDish("Ризотто", 220)
        };

        // Создание объектов для закусок
        Appetizer[] appetizers = {
            new Appetizer("Салат Цезарь", 120),
            new Appetizer("Оливье", 100),
            new Appetizer("Блины с икрой", 150),
            new Appetizer("Тосты с авокадо", 110)
        };

        // Создание объектов для напитков
        Drink[] drinks = {
            new Drink("Кола", 50),
            new Drink("Минеральная вода", 40),
            new Drink("Сок апельсиновый", 70),
            new Drink("Чай черный", 60)
        };

        // Создание объектов для десертов
        Dessert[] desserts = {
            new Dessert("Торт Наполеон", 80),
            new Dessert("Мороженое", 60),
            new Dessert("Чизкейк", 120),
            new Dessert("Пирог с яблоками", 90)
        };

        // Создание объекта заказа
        Order order = new Order();

        boolean ordering = true;
        while (ordering) {
            displayMenu();

            int category = scanner.nextInt();

            switch (category) {
                case 1: {
                    // Главное блюдо
                    displayMainDishes();
                    System.out.print("Выберите главное блюдо (1-4): ");
                    int choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        order.addItem(mainDishes[choice - 1]);
                    } else {
                        System.out.println("Некорректный выбор!");
                    }
                    break;
                }
                case 2: {
                    // Закуски
                    displayAppetizers();
                    System.out.print("Выберите закуску (1-4): ");
                    int choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        order.addItem(appetizers[choice - 1]);
                    } else {
                        System.out.println("Некорректный выбор!");
                    }
                    break;
                }
                case 3: {
                    // Напитки
                    displayDrinks();
                    System.out.print("Выберите напиток (1-4): ");
                    int choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        order.addItem(drinks[choice - 1]);
                    } else {
                        System.out.println("Некорректный выбор!");
                    }
                    break;
                }
                case 4: {
                    // Десерты
                    displayDesserts();
                    System.out.print("Выберите десерт (1-4): ");
                    int choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        order.addItem(desserts[choice - 1]);
                    } else {
                        System.out.println("Некорректный выбор!");
                    }
                    break;
                }
                case 5:
                    // Завершить заказ
                    ordering = false;
                    break;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
                    break;
            }
        }

        // Вывод итогового заказа
        order.displayOrder();
    }
}
