public class Sum_16M_17M {

    // Sum of the harmonic terms 1/k for k = 16,000,000 to 17,000,000 (inclusive)
    public static double find_sum() {
        double sum = 0.0;
        // Add from the smallest terms (k = 17M) to the largest (k = 16M)
        // to reduce floating-point rounding error.
        for (int k = 17_000_000; k >= 16_000_000; k--) {
            sum += 1.0 / k;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find_sum());
    }
}