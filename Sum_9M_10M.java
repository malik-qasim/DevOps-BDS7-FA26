public class Sum_9M_10M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 9000001; i <= 10000000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        double result = find_sum();

        System.out.println("Registration Number: FA23-BDS-036");
        System.out.println("Range: 9,000,001 to 10,000,000");
        System.out.println("Harmonic Sum: " + result);
    }
}
