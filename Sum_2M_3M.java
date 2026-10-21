
public class Sum_2M_3M {

    public static double find_sum() {
        double sum = 0.0;

        for (int i = 2_000_000; i <= 3_000_000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
