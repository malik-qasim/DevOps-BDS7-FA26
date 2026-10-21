public class Sum_9M_10M {

public static double find_sum() {
    double sum = 0.0;

    for (int i = 9000000; i <= 10000000; i++) {
        sum += 1.0 / i;
    }

    return sum;
}

public static void main(String[] args) {
    System.out.println("Sum of harmonic sequence from 9M to 10M: "
            + find_sum());
}

}
