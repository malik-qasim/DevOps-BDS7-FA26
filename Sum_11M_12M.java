public class Sum_11M_12M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 11_000_000; i <= 12_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
