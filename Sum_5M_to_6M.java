public class Sum_5M_to_6M {

    public static double find_sum() {
        double sum = 0.0;
        for (int n = 5_000_000; n < 6_000_000; n++) {
            sum += 1.0 / n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(find_sum());
    }
}
