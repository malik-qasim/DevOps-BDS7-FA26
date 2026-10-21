/**
 * Harmonic sum over a range of integers.
 *
 * Computes 1/start + 1/(start+1) + ... + 1/end (both ends included).
 * Default range: 6,000,000 to 7,000,000.
 *
 * Usage: java Sum_6M_7M [start] [end]
 */
public class Sum_6M_7M {

    static final long START = 6_000_000L;
    static final long END = 7_000_000L;

    /** Returns the sum of 1/n for n = start .. end (inclusive), using Kahan summation. */
    static double find_sum(long start, long end) {
        double sum = 0.0;
        double compensation = 0.0;
        for (long n = start; n <= end; n++) {
            double term = 1.0 / n - compensation;
            double next = sum + term;
            compensation = (next - sum) - term;
            sum = next;
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = args.length > 0 ? Long.parseLong(args[0]) : START;
        long end = args.length > 1 ? Long.parseLong(args[1]) : END;

        long t0 = System.nanoTime();
        double result = find_sum(start, end);
        double elapsed = (System.nanoTime() - t0) / 1e9;

        System.out.printf("Range        : %,d to %,d (inclusive)%n", start, end);
        System.out.printf("Terms        : %,d%n", end - start + 1);
        System.out.printf("Harmonic sum : %.15f%n", result);
        System.out.printf("Time taken   : %.3f s%n", elapsed);
    }
}
