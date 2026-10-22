public class Sum_8M_9M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 8_000_001; i <= 9_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        double result = find_sum();

        System.out.println("Registration Number: FA23-BDS-036");
        System.out.println("Range: 8,000,001 to 9,000,000");
        System.out.println("Number of terms: 1,000,000");
        System.out.println("Harmonic Sum: " + result);
    }
}
