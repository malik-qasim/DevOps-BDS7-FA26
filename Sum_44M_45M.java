public class Sum_44M_45M {
    public static double find_sum() {
        double sum = 0.0;

        for (int i = 44_000_001; i <= 45_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
