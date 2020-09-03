package interfaceexercise3;

import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class IntListSorter implements IntListConsumer {
    List<Integer> intListConsumer = new LinkedList<>();
    Comparator<Integer> comparator;





    Comparator<Integer> asc = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1, o2);
        }
    };
    Comparator<Integer> dsc = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o2, o1);
        }
    };


    @Override
    public void consume(List<Integer> consumerList) {
        Collections.sort(consumerList, asc);
        IntListFileWriter intListFileWriter = new IntListFileWriter(Paths.get("C:", "tmp", "writerAftersort.txt"));
        intListFileWriter.consume(consumerList);
    }



    }






