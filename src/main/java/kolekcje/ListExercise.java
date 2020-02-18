package kolekcje;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExercise {
    //1.Stwórz listę liczb całkowitych, która zawiera elementy: 2, 3, 7, 5, 12, 15.
    //2.Dodaj elementy: 2, 1, 5, 5, 3, 30.
    //3.Dodaj drugą listę elementów zawierającą elementy: 5, 2, 2, 45, 1, 10.
    //4.Wypisz rozmiar listy i sprawdź czy jest pusta.
    //5.Przeiteruj się po liście (for each oraz iterator ) i wyświetl elementy listy na ekranie
    //6.Usuń element oznaczony indeksem nr 2.
    //7.Usuń pierwsze wystąpienie 3.
    //8.Usuń wszystkie wystąpienia 5 i 2.
    //9.Wypisz elementy list na ekranie.
    //10.Sprawdź czy lista zawiera 2.
    //11.Sprawdź czy lista zawiera 3.
    //12.Ile jest w liście elementów parzystych a ile nieparzystych?
    //13.Jaka jest suma elementów w liście?
    //14.Usuń (za pomocą iteratora ) elementy podzielne przez 5
    //15.Jaki jest finalny rozmiar listy? I jakie zawiera elementy?
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>(List.of(2, 3, 7, 5, 12, 15));
        lista.addAll(List.of(2, 1, 5, 5, 5, 3, 30));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        lista.addAll(List.of(5, 2, 2, 45, 1, 10));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        for (int e : lista) {
            System.out.print(e + " ");
        }
        System.out.println("");
        for (Iterator<Integer> it = lista.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }
        lista.remove(2);
        lista.remove(3);
//        lista.removeAll(Collections.singleton(5));
        lista.removeAll(List.of(2, 5));
        System.out.println("");
        for (int e : lista) {
            System.out.print(e + " ");
        }
        System.out.println(lista.contains(2));
        System.out.println(lista.contains(3));
        Iterator<Integer> it = lista.iterator();
        int parzyste = 0;
        int nieparzyste = 0;
        for (Iterator<Integer> iterator = lista.iterator(); iterator.hasNext(); ) {
            if (iterator.next() % 2 == 0) {
                parzyste +=1;
            } else {
                nieparzyste +=1;
            }

        }
        System.out.println(parzyste);
        System.out.println(nieparzyste);
        int suma =0;
        for (int i : lista){
            suma+=i;
        }
        System.out.println(suma);

        while (it.hasNext()){
            if (it.next()%5 == 0){
                it.remove();
            }
        }
        System.out.println(lista);
        System.out.println(lista.size());

    }
}
