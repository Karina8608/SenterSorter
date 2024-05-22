import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SentenceSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String inputText = scanner.nextLine();

        // Заменяем все небуквенные символы и их последовательности на пробел
        String cleanedText = inputText.replaceAll("[^a-zA-Zа-яА-Я]+", " ");

        // Разбиваем текст на предложения
        String[] sentences = cleanedText.split("\\.");

        // Удаляем лишние пробелы и сортируем предложения по длине
        Arrays.sort(sentences, Comparator.comparingInt(String::length));

        // Выводим предложения в порядке возрастания длины
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
    }
}
