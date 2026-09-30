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
}