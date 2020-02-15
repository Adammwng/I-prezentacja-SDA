package string;

public class ExerciseStringBuilder {
    public static void main(String[] args) {
        StringBuilder napis = new StringBuilder();
        napis.append(1).append(" napis ").append(20d);
        String gotowyNapis = napis.toString();
        System.out.println(gotowyNapis);

    }
}
