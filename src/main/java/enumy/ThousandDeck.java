package enumy;

public enum ThousandDeck {
    ACE(11),
    TEN(10),
    KING(4),
    QUEEN(3),
    JACK(2),
    NINE(0);

    private int points;

    ThousandDeck(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
    static int score(ThousandDeck...cards){
        int sum=0;
        for (ThousandDeck c : cards) {
            sum = sum + c.getPoints();
        }
        return sum;
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println(ThousandDeck.score(ThousandDeck.ACE, ThousandDeck.ACE,
                ThousandDeck.ACE, ThousandDeck.TEN, ThousandDeck.TEN, ThousandDeck.JACK,
                ThousandDeck.JACK, ThousandDeck.JACK, ThousandDeck.NINE));

    }
}
