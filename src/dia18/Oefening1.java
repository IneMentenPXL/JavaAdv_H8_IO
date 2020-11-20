package dia18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Oefening1 {
    public static void main(String[] args) {
        try {
            Path path = Path.of("resources/bijlage1.txt");
            Path output = Path.of("resources/output.txt");
            List<String> words = Files.lines(path).distinct().sorted().collect(Collectors.toList());
            System.out.println(words);
            Files.deleteIfExists(output);
            Files.write(output, words);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
