class _21M_22M {
    private static final int FIRST_TERM = 21_000_000;
    private static final int LAST_TERM = 22_000_000;

    static double find_sum() {
        double sum = 0.0;
        for (int i = FIRST_TERM; i <= LAST_TERM; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}