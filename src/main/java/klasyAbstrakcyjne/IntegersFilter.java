package klasyAbstrakcyjne;

import java.util.ArrayList;
import java.util.List;

abstract class IntegersFilter {
    List<Integer> loadNumbers(){
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 101; i++) {
            lista.add(i);
        }return lista;
    }
    List<Integer> filtered (List<Integer> filteredlist){
        return filteredlist;
    }
}
