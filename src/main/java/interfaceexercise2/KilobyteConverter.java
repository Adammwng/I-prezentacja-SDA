package interfaceexercise2;

public class KilobyteConverter implements Converter {
    @Override
    public double convert(int bytes) {
        return bytes * 0.001;
    }

    @Override
    public String unit() {
        return "Kilobyte";
    }
}
