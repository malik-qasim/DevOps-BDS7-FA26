public class Sum_13M_14M {

    // Static function: called on the class itself, no object needed
    public static double find_sum() {
        double a = 13000000;
        double b = 14000000;
        return a + b;
    }

    public static void main(String[] args) {
        double result = Sum_13M_14M.find_sum();
        System.out.println("Sum = " + result);
    }
}
