public class Sum_46M_47M {

    public static double find_sum() {
        double sum = 0.0;
        for (long i = 46_000_000; i <= 47_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
