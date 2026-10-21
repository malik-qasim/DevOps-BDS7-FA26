public class HarmonicMeanCalculator {

    public static double calculateHarmonicMean(long start, long end) {
        if (start > end) {
            throw new IllegalArgumentException("Start value must be <= end value.");
        }
        if (start <= 0) {
            throw new IllegalArgumentException("Harmonic mean requires positive numbers.");
        }

        long count = end - start + 1;
        double reciprocalSum = 0.0;

        // Loop from 15,000,000 to 16,000,000
        for (long i = start; i <= end; i++) {
            reciprocalSum += 1.0 / i;
        }

        return count / reciprocalSum;
    }
}