package tablice;
//Napisz program, który dla zadanej tablicy typu int zwraca:
//Największą wartość. Najmniejszą wartość. Sumę wszystkich wartości. Wartość średnią
public class TableMethods {
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static int sum;
    private static double average;

    public static int getMax(int[] table) {
        for (int e : table) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }

    public static int getMin(int[] table) {
        for (int e : table) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

    public static int getSum(int[] table) {
        for (int e : table) {
            sum += e;
        }
        return sum;
    }

    public static double getAverage(int[] table) {
        for (int e : table) {
            average += e;
        }
        return average / table.length;
    }

    //Napisz program, który na podstawie dwóch tablicy intów stworzy trzecią w taki sposób, że w pierwszej części będzie zawierać
    // elementy z pierwszej tablicy, a w drugiej części elementy z drugiej tablicy.Zmodyfikuj program tak aby elementy do trzeciej
    // tablicy wstawiał naprzemiennie (raz z pierwszej a raz z drugiej).
    public static int[] setTableFromTable(int[] table, int[] table2) {
        int[] table3 = new int[table.length + table2.length];
        for (int i = 0; i < table.length; i++) {
            table3[i] = table[i];
        }
        for (int i = 0; i < table2.length; i++) {
            table3[i + table.length] = table2[i];
        }
        return table3;
    }

    public static int[] setTableFromTablesMix(int[] first, int[] tableLonger) {
        int[] merge = new int[first.length + tableLonger.length];
        int index = 0;
        for (int i = 0; i < first.length; ++i) {
            merge[index++] = first[i];
            merge[index++] = tableLonger[i];
        }
        return merge;
    }
}
