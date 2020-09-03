package interfaceexercise3;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IntListFileWriter implements IntListConsumer {
    Path path;

    public IntListFileWriter(Path path) {
        this.path = path;
    }
    @Override
    public void consume(List<Integer> consumerList) {
        try (final PrintWriter out = new PrintWriter(Files.newOutputStream(path))) {
            for (Integer integer : consumerList) {
                out.println(integer);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
