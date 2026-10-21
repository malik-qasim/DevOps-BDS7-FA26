public class Sum_4M_5M {

    static double find_sum() {
        int start = 4_000_000;
        int end = 5_000_000;

        double sum = 0.0;
        // Add smallest terms first to reduce rounding error
        for (int n = end; n >= start; n--) {
            sum += 1.0 / n;
        }
        return sum;
    }
}