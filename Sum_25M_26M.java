public class Sum_25M_26M {

    public static double find_sum() {
        double sum = 0.0;
        for (long i = 25_000_000; i <= 26_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
