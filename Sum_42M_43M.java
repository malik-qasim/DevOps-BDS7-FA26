// Harmonic sum from 42,000,001 to 43,000,000 - Zobia Akbar
public class Sum_42M_43M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 42_000_001; i <= 43_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }

    public static void main(String[] args) {
        double result = find_sum();

        System.out.println("Name: Zobia Akbar");
        System.out.println("Registration Number: FA23_BDS_046");
        System.out.println("Range: 42,000,001 to 43,000,000");
        System.out.println("Harmonic Sum: " + result);
    }
}
