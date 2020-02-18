package kolekcje;

import java.util.Map;

public class MapIterator {
    public static void main(String[] args) {
        Map<Integer, String> mapa = Map.of(1, "jeden", 2, "dwa", 3, "trzy", 4, "cztery");
        for (Map.Entry<Integer, String> e : mapa.entrySet()) {
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        for (int k : mapa.keySet()) {
            System.out.println(k);
        }
        for (String v : mapa.values()) {
            System.out.println(v);
        }


    }
}
