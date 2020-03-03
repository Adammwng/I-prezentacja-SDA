package klasy.shop;

import klasy.payment.Account;

import java.time.LocalDate;
import java.util.Objects;

public class Client {
    private int id;
    private LocalDate birthDate;
    private String name;
    private String surname;
    private Account account;
    private Basket basket;

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Client(int id, LocalDate birthDate, String name, String surname) {
        this.id = id;
        this.birthDate = birthDate;
        this.name = name;
        this.surname = surname;

    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", birthDate=" + birthDate +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }



    public boolean isAdult (){
        if (birthDate.isBefore(LocalDate.now().minusYears(18))){
            return true;
        }else {
            return false;
        }
    }

}
class Usage2{
    public static void main(String[] args) {
        Client Adam = new Client(12, LocalDate.of(2000, 12, 12), "Adam","D");
        System.out.println(Adam);
        System.out.println(Adam.isAdult());

    }
}
