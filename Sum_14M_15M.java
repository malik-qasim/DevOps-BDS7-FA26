public class Sum_14M_15M {

    public static double find_sum() {
        double sum = 0.0;
        for (int i = 14_000_000; i <= 15_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

}