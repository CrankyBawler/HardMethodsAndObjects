import java.util.Arrays;

public class Main {
    public static Book toBook(Book a) {
        Book[] arr = new Book[5];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = a;
                System.out.println(arr[i].getAuthorName() + ": " + arr[i].getBookName() + ": " + arr[i].getPublishingYear());
                break;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book[] books = new Book[5];
        Book one = new Book("Эрих Мария Ремарк", "Возлюби ближнего своего", 1939);
        Book two = new Book("Грегори Дэвид Робертс", "Шантарам", 2003);
        Book three = new Book("Джером Дэвид Сэлинджер", "Над пропастью во ржи", 1951);
        Book four = new Book("Стивен Кинг", "11/22/63", 2011);
        Book five = new Book("Лев Николаевич Толстой", "Война и мир", 1867);
        toBook(five);
        toBook(four);

             }
}