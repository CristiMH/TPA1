package TPA12;

public class TempConverter {
    public double convertToFahr(double celsius) {
        return (celsius * 1.8) + 32;
    }
    public double convertToCelsius(double fahr) {
        return  (fahr - 32) * 5 / 9;
    }
}
