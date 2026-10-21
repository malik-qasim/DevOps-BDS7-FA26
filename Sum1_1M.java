public class Sum1_1M {

    // Static function that computes the harmonic sum 1/start + ... + 1/end
    public static double find_sum(long start, long end) {
        double sum = 0.0;
        for (long i = start; i <= end; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = 47_000_000L;
        long end   = 48_000_000L;

        long t1 = System.currentTimeMillis();
        double result = find_sum(start, end);
        long t2 = System.currentTimeMillis();

        System.out.println("Harmonic sum from " + start + " to " + end + " = " + result);
        System.out.println("Time taken: " + (t2 - t1) + " ms");
    }
}