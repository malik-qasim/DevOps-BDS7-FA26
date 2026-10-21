public class Sum_33M_34M {

    public static double find_sum() {
        double sum = 0.0;
        for (long i = 33_000_000; i <= 34_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
