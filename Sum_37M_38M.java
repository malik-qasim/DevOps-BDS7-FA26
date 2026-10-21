public class Sum_37M_38M {
    
    public static double find_sum() {
        double sum = 0.0;
        int start = 37_000_000;
        int end = 38_000_000;
        
        for (int i = start; i <= end; i++) {
            sum += 1.0 / i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Harmonic sum from 37M to 38M: " + find_sum());
    }
}
