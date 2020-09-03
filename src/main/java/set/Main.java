package set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(3);
        integers.add(2);
        integers.add(1);
        integers.add(4);
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());
        System.out.println(integers.contains(2));
        integers.addAll(List.of(5,1,2,3,1,2));
        System.out.println(integers.size());
        for (Integer integer : integers) {
            System.out.println(integer*2);
        }
        integers.clear();
        System.out.println(integers.size());


    }
}
