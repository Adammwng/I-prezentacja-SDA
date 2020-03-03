package klasy.payment;

import java.time.LocalDateTime;

public class Transfer {
    private Account source;
    private Account target;
    private long amount;
    private LocalDateTime executionTime;

    public Transfer(Account source, Account target, long amount) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }
    protected LocalDateTime executed(){
        return LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "source=" + source +
                ", target=" + target +
                ", amount=" + amount +
                ", executionTime=" + executionTime +
                '}';
    }
}
