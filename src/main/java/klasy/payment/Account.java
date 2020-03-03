package klasy.payment;

import java.util.Objects;

public class Account {
    private double balance;
    private int number;

    public Account(double balance, int number) {
        this.balance = balance;
        this.number = number;
    }

    public Account(int number) {
        this.number = number;
    }

    public boolean isDebited() {
        if (balance < 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

 protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }



}

class Usage3 {
    public static void main(String[] args) {
        Account konto1 = new Account(21.1, 877363);
        Account konto2 = new Account(-21.1, 87736);
        System.out.println(konto1);
        System.out.println(konto2);
        System.out.println(konto1.isDebited());
        System.out.println(konto2.isDebited());
        Transfer t1 = new Transfer(konto1, konto2, 3);
        System.out.println(t1);
        System.out.println(AccountGenerator.createnewAccount());
        

    }
}