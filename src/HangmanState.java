public enum HangmanState {
    START(
            """
             -----
             |   |
             |
             |
             |
             |
            _|_
            """
    ),
    HEAD(
            """
             -----
             |   |
             |   O
             |
             |
             |
            _|_
            """
    ),
    BODY(
            """
             -----
             |   |
             |   O
             |   |
             |
             |
            _|_
            """
    ),
    LEFT_ARM(
            """
             -----
             |   |
             |   O
             |  /|
             |
             |
            _|_
            """
    ),
    BOTH_ARMS(
            """
             -----
             |   |
             |   O
             |  /|\\
             |
             |
            _|_
            """
    ),
    LEFT_LEG(
            """
             -----
             |   |
             |   O
             |  /|\\
             |  /
             |
            _|_
            """
    ),
    DEAD(
            """
             -----
             |   |
             |   O
             |  /|\\
             |  / \\
             |
            _|_
            """
    );

    private final String art;

    HangmanState(String art) {
        this.art = art;
    }

    public static HangmanState fromTries(int tries) {
        return switch (tries) {
            case 0 -> START;
            case 1 -> HEAD;
            case 2 -> BODY;
            case 3 -> LEFT_ARM;
            case 4 -> BOTH_ARMS;
            case 5 -> LEFT_LEG;
            default -> DEAD; // 6 и больше
        };
    }

    @Override
    public String toString() {
        return art;
    }
}