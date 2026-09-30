import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Random;

public class WordProvider {

    private String PATH;
    private final Random random = new Random();

    public WordProvider(String PATH) {
        this.PATH = PATH;
    }

    Path path = Path.of(PATH);
    List<String> words;

    {
        try {
            words = Files.readAllLines(path);
        } catch (IOException e) {
            System.err.println("Не удалось загрузить слова: " + e.getMessage());
        }
    }

    public String getWord() {
        return words.get(random.nextInt(words.size()));
    }

}
