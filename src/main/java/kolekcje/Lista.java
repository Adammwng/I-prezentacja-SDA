package kolekcje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> lista2 = new LinkedList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
        System.out.println(lista.containsAll(List.of(1, 2, 3)));
        System.out.println(lista.size());
        System.out.println(lista2.size());
        lista.clear();
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains(1));
        lista.add(1);


    }
}
