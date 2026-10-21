public class Sum_26M_27M{

    
    public static double find_sum() {
        double sum = 0;
        for(int i = 2800000; i<2900000; i++){
            sum += 1.0/i;
        }

        return sum;
    }

}
