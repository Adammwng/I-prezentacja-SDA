package tablice;

import java.util.Arrays;

public class TableExercise {

    public static void main(String[] args) {
        int[] table = new int[]{5, 12, -4, 18, 12, 3, 47, -3};
        System.out.println("Z tablicy intów wypisz następujące elementy:");
        System.out.println("Dodatnie:");
        for (int e : table) {
            if (e > 0) {
                System.out.println(e);
            }
        }
        System.out.println("Podzielne przez 3:");
        for (int e : table) {
            if (e % 3 == 0) {
                System.out.println(e);
            }
        }
        System.out.println("Mniejsze od 20 i większe od 4:");
        for (int e : table) {
            if (e > 4 && e < 20) {
                System.out.println(e);
            }
        }
        System.out.println("Dodatnie:");
        for (int i = 0; i < table.length; i++) {
            if (table[i] > 0) {
                System.out.print(table[i] + ",");
            }
        }
        System.out.println("");
        System.out.println("Podzielne przez 3:");
        for (int i = 0; i < table.length; i++) {
            if (table[i] % 3 == 0) {
                System.out.print(table[i] + ",");
            }
        }
        System.out.println("");
        System.out.println("Mniejsze od 20 i większe od 4:");
        for (int i = 0; i < table.length; i++) {
            if (table[i] > 4 && table[i] < 20) {
                System.out.print(table[i] + ",");
            }
        }

        int[] tab = new int[]{-1, 2, -7, 8, -3, 12, -27, 31};
        System.out.println(Arrays.toString(tab));
        System.out.println("W tablicy intów zastąp wszystkie elementy podzielne przez 2 zerami");
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                tab[i] = 0;
            }
        }
        System.out.println(Arrays.toString(tab));
        //sumuj elementy tablicy aż osiągniesz 20. Gdy osiągniesz pożądaną sume, to wyzeruj pozostałe elementy tablicy
        int[] tab2 = new int[]{4, -1, 7, 11, 1, 2, 3, 8};
        int sum = 0;
        for (int i = 0; i < tab2.length; i++) {
            if (sum < 20) {
                sum += tab2[i];
            } else {
                tab2[i] = 0;
            }
        }
        System.out.println(Arrays.toString(tab2));
    }
}
