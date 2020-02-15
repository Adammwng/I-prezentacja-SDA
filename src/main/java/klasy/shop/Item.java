package klasy.shop;

public class Item {
    private String name = "Piłka";
    private double price;
    Item(){
        System.out.println(name);
    }


    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Usage {
    public static void main(String[] args) {
        System.out.println(new Item());
    }
}
