
public class Sum_29M_30M {
    public static double find_sum() {
        double sum = 0.0;

        for (int i = 29_000_001; i <= 30_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
