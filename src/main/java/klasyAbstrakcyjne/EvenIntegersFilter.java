package klasyAbstrakcyjne;

import java.util.ArrayList;
import java.util.List;

public class EvenIntegersFilter extends IntegersFilter {
    @Override
    List<Integer> filtered(List<Integer> filteredlist) {
        List<Integer> evenList = new ArrayList<>();
        for (Integer integer : filteredlist) {
            if (integer%2 == 0){
                evenList.add(integer);
            }
        }
        return evenList;
    }
}
