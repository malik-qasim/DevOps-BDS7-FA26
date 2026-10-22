public class Sum_8M_9M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 8_000_001; i <= 9_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
