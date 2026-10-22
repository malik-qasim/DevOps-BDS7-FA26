
public class Sum_19M_20M {

    public static double find_sum() {
        double sum = 0.0;

        for (long i = 19_000_001L; i <= 20_000_000L; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}