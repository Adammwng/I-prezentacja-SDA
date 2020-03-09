package klasyAbstrakcyjne;

import java.util.ArrayList;
import java.util.List;

abstract class IntegersFilter {
    List<Integer> loadNumbers() {
        List<Integer> exampleList = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            exampleList.add(i);
        }
        return exampleList;
    }

    List<Integer> filtered(List<Integer> filteredlist) {
        return filteredlist;
    }

    public void run() {
        System.out.println(filtered(loadNumbers()));
    }
}
class Main{
    public static void main(String[] args) {
        EvenIntegersFilter evenIntegersFilter = new EvenIntegersFilter();
        evenIntegersFilter.run();
        OddIntegersFilter oddIntegersFilter = new OddIntegersFilter();
        oddIntegersFilter.run();
    }
}

