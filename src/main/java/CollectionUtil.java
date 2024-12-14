import java.util.HashMap;
import java.util.Map;

/*
* Метода, который получает на вход массив элементов и возвращает Map,
* где ключи — это элементы массива, а значения — это количество их вхождений в массив
* */
public class CollectionUtil {

    // Метод для подсчета количества вхождений элементов в массив
    public static <T> Map<T, Integer> countOccurrences(T[] array) {
        // Создаем карту для хранения элементов и их количества
        Map<T, Integer> occurrences = new HashMap<>();

    /**
    *Проходим по каждому элементу массива
    * getOrDefault(element, 0) — это метод объекта Map. Он пытается получить значение для заданного ключа (element).
     * Если элемент уже присутствует в карте (то есть ключ существует), метод возвращает его текущее значение (счётчик вхождений этого элемента).
     * Если элемент отсутствует в карте, метод возвращает значение по умолчанию, которое в данном случае равно 0.
     * Это означает, что элемент еще не встречался в массиве, и его количество нужно считать как 0.
     * После получения текущего количества вхождений для элемента, мы увеличиваем его на 1, так как текущий элемент найден в массиве, и его нужно учесть.
    */
    for (T element : array) {
            // Проверяем, если элемент уже есть в карте
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
        }

        return occurrences;
    }

    public static void main(String[] args) {
        // Пример использования метода
        Integer[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        Map<Integer, Integer> result = countOccurrences(array);

        // Выводим результат
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

