import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class HangmanGame {

    void startGame(Scanner scanner, String word) {

        Set<Character> usedLetters = new HashSet<>();

        System.out.println("Игра запущена! Слово состоит из " + word.length());

        for (int i = 5; i > 0; i--) {

            letterCheck(scanner);

        }

    }

    void letterCheck(Scanner scanner) {

        while (true) {
            System.out.println("Введите букву");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Строка не может быть пустой!");
            } else if (input.length() != 1) {
                System.out.println("Вводите по одному символу за раз");
            } else if (letterUsed()) {

            }
        }
    }

    boolean letterUsed(Set<Character> letters, char letter) {

        if (letters.contains(letter)) {
            System.out.println("Эта буква уже есть!");
            return false;
        } else {
            letters.add(letter);
            return true;
        }
    }



}
