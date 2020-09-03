package interfaceexercise2;

public class MegabyteConverter implements Converter {
    @Override
    public double convert(int bytes) {
       return bytes * 1e-6;
    }

    @Override
    public String unit() {
        return "Megabyte";
    }
}
