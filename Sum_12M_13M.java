public class Sum_12M_13M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 12_000_000; i <= 13_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Harmonic Sum (12M to 13M) = " + find_sum());
    }
}