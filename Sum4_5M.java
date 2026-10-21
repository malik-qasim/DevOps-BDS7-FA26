public class Sum4_5M {

    static double find_sum(int start, int end) {
        double sum = 0.0;
        // Add smallest terms first to reduce rounding error
        for (int n = end; n >= start; n--) {
            sum += 1.0 / n;
        }
        return sum;
    }

    public static void main(String[] args) {
        int start = 4_000_000;
        int end = 5_000_000;
        System.out.println("Harmonic sum from " + start + " to " + end + " = " + find_sum(start, end));
    }
}