import java.util.*;

public class HangmanGame {

    void startGame(Scanner scanner, String word) {

        Set<Character> usedLetters = new HashSet<>();
        char[] hiddenLetters = initialize(word.length()); /* в этом случае можно было бы
        использовать arrays.fill(), но по мне теряется смысл пет проекта (все сам для учебы) +
        когда ко мне в голову пришла подобная реализация, я почуствовал себя g / chad и уже не мог
        от нее отказатся pogChamp #петпроектырулят #хочуврек
        */

        System.out.println("Игра запущена! Слово состоит из " + word.length());
        System.out.println(hiddenLetters);

        for (int i = 5; i > 0; i--) {

            System.out.println("Осталось попыток: " + i);
            char letter = inputAndletterCheck(scanner, usedLetters);
            checkLetter(letter, word, hiddenLetters);
            System.out.println(hiddenLetters);

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

    char[] initialize(int length) {

        char[] temp = new char[length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = '_';
        }

        return temp;
    }

    void checkLetter(char letter, String word, char[] hiddenLetters) {
        boolean contains = false;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                hiddenLetters[i] = letter;
                contains = true;
            }
        }

        System.out.println(contains ? "Да, такая буква есть!" : "Нет, такой буквы не было");
    }



}
