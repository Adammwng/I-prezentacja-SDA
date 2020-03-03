package klasy.shop;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> basket = new ArrayList<>();

    public List<Item>addItem(Item product) {
        if (product != null) {
            basket.add(product);
        }return basket;
    }
    public List<Item> removeItem (Item product){
        if (product != null) {
            basket.remove(product);
        }return basket;
    }
    public double value (){
        double sum = 0;
      for (Item i : basket){
          sum += i.getPrice();
      }return sum;
    }


    public List<Item> getBasket() {
        return basket;
    }

    public void setBasket(List<Item> basket) {
        this.basket = basket;
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
        System.out.println(b1.getBasket());
        b1.addItem(y);
        b1.addItem(z);
        System.out.println(b1.getBasket());
        b1.removeItem(y);
        System.out.println(b1.getBasket());
        System.out.println(b1.getBasket());
        for (Item i : b1.getBasket()){
            System.out.println(i);
        }

        System.out.println(b1.value());


    }
}
