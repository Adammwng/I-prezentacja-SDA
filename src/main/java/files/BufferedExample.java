package files;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


    public class BufferedExample {
        public static void main(String[] args) {
            final Path file = Paths.get("C:", "tmp", "example3.txt");
            long start = 0;
            long end = 0;
            try (final PrintWriter out = new PrintWriter(Files.newOutputStream(file))) {
                start = System.currentTimeMillis();
                for (int i = 0; i < 1_000; ++i) {
                    out.println("lorem ipsum polelum blablabl blabl labl ablalb lblalblabl lbalb lalb alblablabl");
                }
                end = System.currentTimeMillis();
                System.out.println(end - start + "ms");
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }

            try (final PrintWriter out = new PrintWriter(new BufferedOutputStream(Files.newOutputStream(file)))) {
                start = System.currentTimeMillis();
                for (int i = 0; i < 1_000; ++i) {
                    out.println("lorem ipsum polelum blablabl blabl labl ablalb lblalblabl lbalb lalb alblablabl");
                }
                end = System.currentTimeMillis();
                System.out.println(end - start + "ms");
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }
    }


