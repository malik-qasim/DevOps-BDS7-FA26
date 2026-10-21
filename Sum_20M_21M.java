
public class Sum_20M_21M {

    public static double find_sum() {
        double sum = 0.0;

        for (long i = 20_000_001L; i <= 21_000_000L; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        double result = find_sum();
        System.out.println("Harmonic Sum (20M to 21M): " + result);
    }
}
