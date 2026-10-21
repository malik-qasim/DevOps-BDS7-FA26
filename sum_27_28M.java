public class sum_27_28M {

    // Returns the sum of the harmonic series from 1 to 27,280,000
    // H(n) = 1/1 + 1/2 + 1/3 + ... + 1/n
    public static double find_sum() {
        double sum = 0.0;
        int n = 27_280_000; // 27-28 million
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Harmonic Sum (1 to 27,280,000) = " + find_sum());
    }
}
