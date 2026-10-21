public class sum_33_34M {

    public static double find_sum() {
        double sum = 0.0;
        for (int i = 33_000_000; i <= 34_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Harmonic Sum (33M to 34M) = " + find_sum());
    }
}