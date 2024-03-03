package TPA4;

public class NumbersComparator {
    public double max(double arg1, double arg2) {
        if (arg1 > arg2) {
            return arg1;
        }
        return arg2;
    }

    public double min(double arg1, double arg2) {
        if (arg1 > arg2) {
            return arg2;
        }
        return arg1;
    }
}
