package hWorke27;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        System.out.printf("%.2f",sqrt().apply(3.6));

    }

    static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double>unaryOperator=a->Math.sqrt(a);
        return unaryOperator;
    }
}