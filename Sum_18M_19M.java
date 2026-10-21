public class Sum_18M_19M {

    /**
     * Static function that calculates the harmonic sum
     * from 18 million to 19 million.
     */
    public static double find_sum() {
        int start = 18_000_000;
        int end = 19_000_000;

        double sum = 0.0;

        for (int i = start; i <= end; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}