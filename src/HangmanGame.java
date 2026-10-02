import java.util.*;

public class HangmanGame {

    void startGame(Scanner scanner, String word) {

        Set<Character> usedLetters = new HashSet<>();

        System.out.println("Игра запущена! Слово состоит из " + word.length());

        for (int i = 5; i > 0; i--) {

            System.out.println("Осталось попыток: " + i);
            char letter = inputAndletterCheck(scanner, usedLetters);

        }

    }

    char inputAndletterCheck(Scanner scanner, Set<Character> usedLetters) {

        while (true) {
            System.out.println("Введите букву");
            String input = scanner.nextLine();
            if (input.length() == 1) {

                char letter = input.charAt(0);
                letter = Character.toLowerCase(letter);

                if (!Character.isLetter(letter)) {
                    System.out.println("Введите букву, а не цифру или символ!");
                    continue;
                }
                if (letterUsed(usedLetters, letter)) {
                    return letter;
                }
            } else {
                System.out.println("Некоректный ввод! Вводите по одной букве за раз!");
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
