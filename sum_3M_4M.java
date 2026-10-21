
public class sum_3M_4M {

    public static double find_sum() {
        double sum = 0;

        for (int i = 3000000; i <= 4000000; i++) {
            sum += 1.0 / i;
        }

        return sum;
    }
}
