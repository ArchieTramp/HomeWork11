import java.math.BigInteger;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        Stream.of(3, 13, 25, 39, 41, 54)
                .map(Streams::Factorial)
                .forEach(System.out::println);

    }

    static BigInteger Factorial(int x) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= x; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
