package klasy.shop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket {
    private List<Item> koszyk = new ArrayList<>();

    public List<Item>addItem(Item product) {

        if (product != null) {
            koszyk.add(product);
        }return koszyk;
    }
    public List<Item> removeItem (Item product){
        if (product != null) {
            koszyk.remove(product);
        }return koszyk;
    }
    public double value (){
        double sum = 0;
      for (Item i : koszyk){
          sum += i.getPrice();
      }return sum;
    }


    public List<Item> getKoszyk() {
        return koszyk;
    }

    public void setKoszyk(List<Item> koszyk) {
        this.koszyk = koszyk;
    }
}

class Main {
    public static void main(String[] args) {
        Item x = new Item("piłka", 9.99);
        Item y = new Item("kosz", 39.99);
        Item z = new Item("buty", 99.99);

        Basket b1 = new Basket();
        Basket b2 = new Basket();
        Basket b3 = new Basket();
        b1.addItem(x);
        System.out.println(b1.getKoszyk());
        b1.addItem(y);
        b1.addItem(z);
        System.out.println(b1.getKoszyk());
        b1.removeItem(y);
        System.out.println(b1.getKoszyk());
        System.out.println(b1.getKoszyk());
        for (Item i : b1.getKoszyk()){
            System.out.println(i);
        }

        System.out.println(b1.value());


    }
}
