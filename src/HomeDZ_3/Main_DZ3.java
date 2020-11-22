package HomeDZ_3;

import java.util.*;

public class Main_DZ3 {

    public static void main(String[] args) {
        firstPart();
        secondPart();
    }



    private static void firstPart() {
        String[] towns = {"Москва", "Рига", "Псков", "Москва", "Тверь", "Коломна", "Псков", "Суздаль", "Владимир", "Москва", "Сочи", "Суздаль", "Адлер", "Тверь", "Воронеж", "Коломна"};
        List<String> wordArray = Arrays.asList(towns);

        System.out.println("Исходный массив слов:");
        System.out.println(wordArray);

        System.out.println("\nМассив с уникальными словами и количеством их повторений:");

        Map<String, Integer> mapList = new HashMap<>();
        Set<String> unique = new HashSet<>(wordArray);
        for (String key: unique) {
            mapList.put(key, Collections.frequency(wordArray, key));
        }
        System.out.println(mapList + "\n");
    }



    private static void secondPart() {
        LinkedList<Book> catalog = new LinkedList<>();

        Book recording1 = new Book("Иванов", 790352829);
        Book recording2 = new Book("Петров", 786555434);
        Book recording3 = new Book("Сидоров", 786555435);
        Book recording4 = new Book("Васечкин", 786555433);
        Book recording5 = new Book("Ложечкин", 786895439);
        Book recording6 = new Book("Борисов", 706555438);
        Book recording7 = new Book("Горбатов", 786500433);
        Book recording8 = new Book("Петров", 786555227);
        Book recording9 = new Book("Петров", 786533431);
        Book recording10 = new Book("Горбатов", 116555435);
        Book recording11 = new Book("Сидоров", 786555499);
        Book recording12 = new Book("Васечкин", 786588432);
        Book recording13 = new Book("Сидоров", 787755433);
        Book recording14 = new Book("Иванов", 786565430);
        Book recording15 = new Book("Гужеля", 786555002);

        catalog.add(recording1);
        catalog.add(recording2);
        catalog.add(recording3);
        catalog.add(recording4);
        catalog.add(recording5);
        catalog.add(recording6);
        catalog.add(recording7);
        catalog.add(recording8);
        catalog.add(recording9);
        catalog.add(recording10);
        catalog.add(recording11);
        catalog.add(recording12);
        catalog.add(recording13);
        catalog.add(recording14);
        catalog.add(recording15);

        searchRequest(catalog, "Петров");
    }


    /*******************Ищем в справочнике телефоны нужной фамилии*********/
    private static void searchRequest(LinkedList<Book> catalog, String firstName) {
        for(Book o: catalog) {
            if (o.getName() == firstName) {
                System.out.println("Телефон " + o.getName() + "а " + o.getTelephone());
            }
        }
    }


    /*******************Задаем телефонный справочник*********/
    static class Book {
        String name;
        int telephone;

        public Book(String name, int telephone) {
            this.name = name;
            this.telephone = telephone;
        }

        public String getName() {
            return name;
        }


        public int getTelephone() {
            return telephone;
        }

    }
}
