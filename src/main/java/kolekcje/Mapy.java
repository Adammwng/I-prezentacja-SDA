package kolekcje;

import java.util.HashMap;
import java.util.Map;

public class Mapy {
    public static void main(String[] args) {
        Map <Integer,String> mapa = new HashMap<>();
        Map <Integer,String> mapa2 = new HashMap<>();
        mapa2.put(2, "two");
        mapa2.put(3, "three");
        mapa.put(1, "jeden");
        mapa.put(1, "one");
        mapa.putIfAbsent(1, "uno");
        mapa.putAll(mapa2);
        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.get(4));
        System.out.println(mapa.getOrDefault(5, "five"));
        mapa.remove(1);
        mapa.replace(1, "jeden");
        mapa.replace(2, "dwa");
        System.out.println(mapa.get(1));
        System.out.println(mapa.get(2));
        System.out.println(mapa.size());
        System.out.println(mapa.containsKey(2));
        System.out.println(mapa.containsValue("dwa"));


    }
}
