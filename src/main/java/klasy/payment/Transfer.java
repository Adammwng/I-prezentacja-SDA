package klasy.payment;

public class Transfer {
    private Account source;
    private Account target;
    private long amount;

    public Transfer(Account source, Account target, long amount) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "source=" + source +
                ", target=" + target +
                ", amount=" + amount +
                '}';
    }
}
