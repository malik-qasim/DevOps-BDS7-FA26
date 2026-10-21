public class Sum_52_53M {

    static double findSum() {
        final int n = 52;
        double total = 0.0;

        for (int k = 1; k <= n; k++) {
            double reciprocalSum = 0.0;
            for (int i = 1; i <= k; i++) {
                reciprocalSum += 1.0 / i;
            }
            // Harmonic mean of 1..k = k / (1 + 1/2 + ... + 1/k)
            total += k / reciprocalSum;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(findSum());
    }
}
