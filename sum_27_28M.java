public class sum_27_28M {

    public static double find_sum() {
        double sum = 0.0;
        for (long i = 27_000_000L; i <= 28_000_000L; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}
