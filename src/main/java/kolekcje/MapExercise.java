package kolekcje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercise {
    //1.Stwórz mapę, która liczbą od 1 do 5 przypisze im ich angielskie nazwy
    //2.Wypisz wszystkie pary (klucz, wartość) na ekran w formacie jak powyżej.
    //3.Sprawdź czy mapa zawiera klucz 4 i 6. Jeśli tak wypisz na ekran wartość, jeśli nie wypisz “no value
    //4.Usuń element o kluczu 4 oraz 10.
    //5.Wstaw polską nazwę liczby 3 (trzy) pod odpowiadający jej klucz. Co jest teraz w mapie pod kluczem 3?
    //6.Zastąp element o kluczu 2 hiszpańskim odpowiednikiem („ dos
    //7.Sprawdź rozmiar mapy.
    //8.Sprawdź czy mapa jest pusta.
    //9.Sprawdź czy mapa zawiera wartości: „ dos ”, „dziesięć”, three
    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        for (Map.Entry<Integer, String> e : numbers.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println(numbers.containsKey(4));
        System.out.println(numbers.getOrDefault(4, "no value"));
        System.out.println(numbers.containsKey(10));
        System.out.println(numbers.getOrDefault(10, "no value"));
        numbers.remove(4);
        numbers.remove(10);
        numbers.put(3, "trzy");
        System.out.println(numbers.get(3));
        numbers.replace(2, "dos");
        System.out.println(numbers.size());
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.containsValue("dos"));
        System.out.println(numbers.containsValue("dziesiec"));
        System.out.println(numbers.containsValue("three"));

        //Zainicjalizuj listę następującymi wartościami: [ 5, 3, 1, 5, 1, 1, 3, 3, 2, 7, 5, 7, 4].
        //Zlicz i wypisz ile razy wystąpiła dana liczba całkowita (użyj mapy).
        List<Integer> lista = new ArrayList<>(List.of(5, 3, 1, 5, 1, 1, 3, 3, 2, 7, 5, 7, 4));
        Map<Integer, Integer> num = new HashMap<>();
        int value = 1;
        for (int i : lista) {

if(num.containsKey(i)){
    num.put(i, value++);

}else
            num.putIfAbsent(i, value);


        }
        System.out.println(num.size());
        System.out.println(num.get(4));
        int liczba;
        for (Integer k : num.keySet()) {
            System.out.print(k);
        }
        for (Map.Entry<Integer, Integer> e : num.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
    }
}
