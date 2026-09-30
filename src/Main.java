

void main() {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Добро пожаловать в игру!");

    printMenu(scanner);


}

void printMenu(Scanner scanner) {

    int parsedInput;

    while (true) {
        System.out.println("Выберите, что вы хотите сделать:");
        System.out.println("1 - начать игру");
        System.out.println("2 - выйти");

        String input = scanner.nextLine();

        try {
            parsedInput = Integer.parseInt(input);
            switch (parsedInput) {
                case 1:
                    ;
                case 2:
                    return;
                default:
                    System.out.println("Я не знаю такой команды!");

            }
        } catch (NumberFormatException e) {
            System.out.println("Нужно вводить цифры!");
        }
    }
}
