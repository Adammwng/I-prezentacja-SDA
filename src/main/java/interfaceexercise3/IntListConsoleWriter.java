package interfaceexercise3;

import java.util.List;

public class IntListConsoleWriter implements IntListConsumer{
    @Override
    public void consume(List<Integer> consumerList) {
        System.out.println(consumerList);
    }
}
