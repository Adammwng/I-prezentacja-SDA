package klasy.shop;

import klasy.payment.Account;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Shop {
    private Account account;
    static Map<Client, Basket> basketOfClient = new HashMap<Client, Basket>();

    public void setAccount(Account account) {
        this.account = account;
    }

    public void addToBasket(Item item, Client client) {
        Basket basket = client.getBasket();
        if (basket != null) {
            basket.addItem(item);
        }client.setBasket(basket);
    }
    public static List<Item> getClientItems(Client client){
        Basket basket = client.getBasket();
            return (List<Item>) basket;

    }
}
