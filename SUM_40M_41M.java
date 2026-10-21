/**
 * Computes 1/start + 1/(start+1) + ... + 1/end.
 * Default range: 40,000,000 to 41,000,000 (inclusive).
 *
 * Usage: java SUM_40M_41M [start] [end]
 */
public class SUM_40M_41M {

    static final long START = 40_000_000L;
    static final long END = 41_000_000L;

    /** Computes the harmonic sum using Kahan summation. */
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