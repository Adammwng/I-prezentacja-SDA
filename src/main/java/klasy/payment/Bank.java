package klasy.payment;


import klasy.shop.Client;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Bank {

    static List<Account> accountList = new LinkedList<>();
    private List<Transfer> transferList = new LinkedList<>();
    Map<Client, Account> clientAccountMap = new HashMap<>();

    public static Account openAccount (double balance){
        Account a = AccountGenerator.createnewAccount();
        a.setBalance(balance);
        accountList.add(a);
        return a;
    }

}
class Main extends Bank{
    public static void main(String[] args) {
      Account a1= Bank.openAccount(45);
        System.out.println(a1.getNumber());
        Account a2 =Bank.openAccount(55);
        System.out.println(a2.getNumber());
        System.out.println(a2.getBalance());
        System.out.println(a1.getBalance());
        System.out.println(accountList);

    }}
