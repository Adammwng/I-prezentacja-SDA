package interfaceexercise2;

public class GigabyteConverter implements Converter {
    @Override
    public double convert(int bytes) {
        return bytes * 1e-9;
    }

    @Override
    public String unit() {
        return "Gigabyte";
    }
}
