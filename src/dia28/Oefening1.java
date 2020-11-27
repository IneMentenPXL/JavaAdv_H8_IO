package dia28;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Oefening1 {
    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("resources/code.code"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split(" ");
                Arrays.stream(strings).forEach(word -> {
                    if (word.toUpperCase().equals(word)) {
                        System.out.print(word);
                    }
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
