package tablice;

import java.util.Arrays;

public class MainTest {


    public static void main(String[] args) {
        int[] table1 = new int[]{1, 2, 3};
        int[] table2 = new int[]{4, 5, 6, 7, 8};
        for (int e : table1) {
            System.out.print(e + "'");
        }
        System.out.println("");
        System.out.println(Arrays.toString(table1));
        System.out.println(TableMethods.getMax(table1));
        System.out.println(TableMethods.getMin(table1));
        System.out.println(TableMethods.getSum(table1));
        System.out.println(TableMethods.getAverage(table1));
        int[] table3 = TableMethods.setTableFromTable(table1, table2);
        System.out.println(Arrays.toString(table3));
        int[] table4 = TableMethods.setTableFromTablesMix(table1, table2);
        System.out.println(Arrays.toString(table4));
        int[] tab1 = new int[]{1, 2};
        int[] tab2 = new int[]{2, 1};
        System.out.println(Arrays.equals(tab1, tab2));
        String[] tabName = new String[]{"Adam", "Mick"};
        String[] tabName2 = new String[]{"Bob", "Teodor"};
    }
}
