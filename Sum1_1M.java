public class Sum1_1M {

    public static double find_sum(long start, long end) {
        double sum = 0.0;

        for (long i = start; i <= end; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        long start = 49000000L;
        long end = 50000000L;

        long t1 = System.currentTimeMillis();
        double result = find_sum(start, end);
        long t2 = System.currentTimeMillis();

        System.out.println("Harmonic sum from " + start + " to " + end + " = " + result);
        System.out.println("Time taken: " + (t2 - t1) + " ms");
    }
}
