package comparator;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Package> packageList = new LinkedList<>();
        packageList.add(new Package(25.25, 5.31, LocalDate.of(2019, 12, 02)));
        packageList.add(new Package(35.15, 8.31, LocalDate.of(2019, 12, 01)));
        packageList.add(new Package(6.17, 0.41, LocalDate.of(2019, 11, 18)));
        packageList.add(new Package(141.12, 1.15, LocalDate.of(2019, 11, 29)));
        packageList.add(new Package(41.94, 2.14, LocalDate.of(2019, 11, 21)));

        Comparator<Package> byValueAsc = new Comparator<Package>() {
            @Override
            public int compare(Package o1, Package o2) {
                return Double.compare(o1.getValue(), o2.getValue());
            }
        };
        Comparator<Package> byWeightDsc = new Comparator<Package>() {
            @Override
            public int compare(Package o1, Package o2) {
                return Double.compare(o2.getWeight(), o1.getWeight());
            }
        };
        Comparator<Package> byShipDateAsc = new Comparator<Package>() {
            @Override
            public int compare(Package o1, Package o2) {
                if (o1.getShipDate().isBefore(o2.getShipDate())) {
                    return -1;
                } else if (o1.getShipDate().isAfter(o2.getShipDate())) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };

        Collections.sort(packageList, byValueAsc);
        System.out.println(packageList);
        Collections.sort(packageList, byWeightDsc);
        System.out.println(packageList);
        Collections.sort(packageList, byShipDateAsc);
        System.out.println(packageList);
    }
}
