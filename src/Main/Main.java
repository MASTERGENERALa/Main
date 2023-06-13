package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

    public class Main {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();

            // Додайте числа до списку
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

            // Отримайте ListIterator для списку
            ListIterator<Integer> iterator = numbers.listIterator();

            // Пройдіться по списку та збільште значення на 1
            while (iterator.hasNext()) {
                int number = iterator.next();
                iterator.set(number + 1);
            }

            // Виведіть список у консоль
            for (int number : numbers) {
                System.out.println(number);
            }
        }
}

