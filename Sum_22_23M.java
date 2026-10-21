public class Sum_22M_23M {
    public static double find_sum() {
        double sum = 0.0;
        for (int i = 22000000; i <= 23000000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of Harmonic Series (22M to 23M): " + find_sum());
    }
}