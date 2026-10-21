public class Sum_52_53M {

    public static double find_sum() {
        double sum = 0.0;
        // Add from the smallest terms (largest n) to the largest to reduce floating-point error
        for (long n = 53_000_000L; n >= 52_000_000L; n--) {
            sum += 1.0 / n;
        }
        return sum;
    }
}