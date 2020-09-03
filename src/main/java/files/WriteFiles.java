package files;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFiles {
    public static void main(String[] args) {
        final Path exampleFile = Paths.get("C:","tmp", "example.txt");
        try(final PrintWriter out = new PrintWriter(Files.newOutputStream(exampleFile))) {
            for (int i = 0; i < 15 ; i++) {
                out.println("My line " + i);
            }
        }catch (IOException e){
            throw new UncheckedIOException(e);
        }
        try (final PrintWriter out = new PrintWriter(Files.newOutputStream(exampleFile, StandardOpenOption.APPEND))) {
            for (int i = 0; i < 5; ++i) {
                out.println(i);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
