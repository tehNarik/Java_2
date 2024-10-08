import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть рядок:");
        String text = scanner.nextLine();

        String[] wordsArray = text.toLowerCase().split("\\s+");

        String[] uniqueWords = new String[wordsArray.length];
        int uniqueCount = 0;

        for (String word : wordsArray) {
            if (!isWordInArray(uniqueWords, word, uniqueCount)) {
                uniqueWords[uniqueCount] = word;
                uniqueCount++;
            }
        }

        uniqueWords = Arrays.copyOf(uniqueWords, uniqueCount);

        Arrays.sort(uniqueWords);

        System.out.println("Унікальні слова в алфавітному порядку:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
    public static boolean isWordInArray(String[] array, String word, int count) {
        for (int i = 0; i < count; i++) {
            if (array[i].equals(word)) {
                return true;
            }
        }
        return false;
    }
}