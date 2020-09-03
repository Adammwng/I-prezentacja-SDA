package files;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FilesExercise {
    public static void main(String[] args) {
        final Path exampleFile = Paths.get("C:", "tmp", "example.txt");
        try (
                Scanner in = new Scanner(Files.newInputStream(exampleFile))) {
            int counter = 0;
            while (in.hasNextLine()) {
                String line = in.nextLine();
                if (counter++ % 2 == 0) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        try {
            final List<String> lines = Files.readAllLines(exampleFile);
            for (final String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
