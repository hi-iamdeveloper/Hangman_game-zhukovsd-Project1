

void main() {

    Scanner scanner = new Scanner(System.in);
    WordProvider provider = wordProviderInitialize("src/words.txt");

    firstGreeting();

    while (true) {

        printMenu();
        startGame(scanner, provider);
    }


}

void printMenu() {

        System.out.println("Выберите, что вы хотите сделать:");
        System.out.println("1 - начать игру");
        System.out.println("2 - выйти");

}

void startGame(Scanner scanner, WordProvider provider) {

    int parsedInput;

    String input = scanner.nextLine();

    try {
        parsedInput = Integer.parseInt(input);
        switch (parsedInput) {
            case 1:
                HangmanGame game = new HangmanGame();
                game.startGame(scanner, provider.getWord());
            case 2:
                return;
            default:
                System.out.println("Я не знаю такой команды!");

        }
    } catch (NumberFormatException e) {
        System.out.println("Нужно вводить цифры!");
    }


}

void firstGreeting() {
    System.out.println("Добро пожаловать в игру!");
}

WordProvider wordProviderInitialize(String path) {
    return new WordProvider(path);
}
