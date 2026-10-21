public class Sum_10M_11M {

    public static double find_sum() {
        double sum = 0.0;

        for (long i = 10_000_001L; i <= 11_000_000L; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}