public class Sum_25M_26M {

    public static double find_sum() {
        double sum = 0.0;
        // Sum from the smallest terms (26M) to the largest (25M) to reduce floating-point error
        for (long i = 26_000_000L; i >= 25_000_000L; i--) {
            sum += 1.0 / i;
        }
        return sum;
    }
}