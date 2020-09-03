package interfaceexercise3;

import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new LinkedList<>(List.of(-1,10,15,-12,3,4));
        List<Integer> lista2 = new LinkedList<>(List.of(9,8,7,6,5,4));
        List<Integer> lista3 = new LinkedList<>(List.of(-4,-3,-2,-1,0,1));
        IntListConsoleWriter a = new IntListConsoleWriter();
        a.consume(lista1);
        a.consume(lista2);
        a.consume(lista3);
        IntListFileWriter writer = new IntListFileWriter(Paths.get("C:", "tmp", "writer.txt"));
        IntListFileWriter writer2 = new IntListFileWriter(Paths.get("C:", "tmp", "writer2.txt"));
        IntListFileWriter writer3 = new IntListFileWriter(Paths.get("C:", "tmp", "writer3.txt"));
        writer.consume(lista1);
        writer2.consume(lista2);
        writer3.consume(lista3);
        IntListSorter sorter = new IntListSorter();
        sorter.consume(lista1);

    }
}
