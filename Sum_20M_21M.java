public class Sum_20M_21M {

    /**
     * Static function that hardcodes the range from 21 million to 22 million 
     * and returns the harmonic sum as a double.
     */
    public static double find_sum() {
        int start = 20_000_000; // 21 million
        int end = 21_000_000;   // 22 million

        double sum = 0.0;
        for (int i = start; i <= end; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}