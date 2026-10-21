public class Sum_40M_41M {

    public static double find_sum() {
        double sum = 0.0;
        for (long n = 41_000_000L; n >= 40_000_001L; n--) {
            sum += 1.0 / n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum 40M-41M = " + find_sum());
    }
}