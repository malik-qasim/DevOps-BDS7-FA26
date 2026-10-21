public class sum_27_28M {

    public static double find_sum() {
        double sum = 0.0;
        for (int i = 27_000_000; i <= 28_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Harmonic Sum (27M to 28M) = " + find_sum());
    }
}
