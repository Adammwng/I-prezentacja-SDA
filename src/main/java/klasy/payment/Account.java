package klasy.payment;

public class Account {
    private double balance;
    private String number;

    public Account(double balance, String number) {
        this.balance = balance;
        this.number = number;
    }

    public Account(String number) {
        this.number = number;
    }

    public boolean isDebited() {
        if (balance < 0) {
            return true;
        } else {
            return false;
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", number='" + number + '\'' +
                '}';
    }
}

class Usage3 {
    public static void main(String[] args) {
        Account konto1 = new Account(21.1, "87736363663");
        Account konto2 = new Account(-21.1, "87736363663");
        System.out.println(konto1);
        System.out.println(konto2);
        System.out.println(konto1.isDebited());
        System.out.println(konto2.isDebited());
        Transfer t1 = new Transfer(konto1, konto2, 3);
        System.out.println(t1);
    }
}