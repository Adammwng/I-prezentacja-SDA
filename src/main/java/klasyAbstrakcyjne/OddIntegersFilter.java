package klasyAbstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class OddIntegersFilter extends IntegersFilter {
    @Override
    List<Integer> filtered(List<Integer> filteredlist) {
        List<Integer> oddList = new ArrayList<>();
        for (Integer integer : filteredlist) {
            if (integer%2 != 0){
              oddList.add(integer);
            }
        }
        return oddList;
    }
}
