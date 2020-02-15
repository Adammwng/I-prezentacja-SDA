package kolekcje;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        for (int i : lista) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (Iterator<Integer> it = lista.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("");

        //usunięcie elementu za pomocą Iteratora
        List<Integer> lista2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        Iterator<Integer> it2 = lista2.iterator();
        while (it2.hasNext()) {
            if (it2.next() % 2 == 0) {
                it2.remove();
            }
        }
        System.out.println(lista2);
    }
}
