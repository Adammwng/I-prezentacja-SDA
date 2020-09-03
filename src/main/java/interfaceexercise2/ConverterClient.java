package interfaceexercise2;

public class ConverterClient {
    Converter converter;

    public ConverterClient(Converter converter) {
        this.converter = converter;
    }

    public void run (int bytes){
        System.out.println(bytes + " are equal to " + converter.convert(bytes) + " " + converter.unit());
    }

    public static void main(String[] args) {
        ConverterClient kilo = new ConverterClient(new KilobyteConverter());
        ConverterClient mega = new ConverterClient(new MegabyteConverter());
        ConverterClient giga = new ConverterClient(new GigabyteConverter());
        kilo.run(916045);
        mega.run(12458465);
        giga.run(45748);
    }
}
