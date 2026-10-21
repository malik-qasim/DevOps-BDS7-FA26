public class Sum_1_1M {
    public static double find_sum() {
        double sum = 0.0;

        for (int i = 1; i <= 1_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}