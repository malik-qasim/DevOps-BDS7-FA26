public class sum_1M_2M {

    public static double find_sum() {
        double sum = 0.0;
        for (int i = 1_000_000; i <= 2_000_000; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {


        double sum_to_print = find_sum();
        System.out.println("Harmonic Sum (1M to 2M) = " +sum_to_print );
    
    }
}
