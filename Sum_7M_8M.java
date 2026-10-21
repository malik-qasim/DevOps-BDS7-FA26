public class sum_7_8M {
    public static double find_sum() {
        double sum = 0.0;
        for (int i = 7_000_000; i <= 8_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Harmonic Sum (7M to 8M) = " + find_sum());
    }
}
