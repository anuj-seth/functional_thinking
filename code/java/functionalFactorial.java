import java.util.*;
import java.util.stream.*;

public class functionalFactorial {
    public static int factorial(int n) {
        int fact_of_n = IntStream.rangeClosed(2, n)
            .reduce(1, (x, y) -> x * y);
        return fact_of_n;
    }

    public static void main(String []args) {
        assert factorial(0) == 1;

        assert factorial(1) == 1;

        assert factorial(3) == 6;

        assert factorial(5) == 120;

        assert factorial(8) == 40320;
    }
}
