package uz.com.calculator;

/**
 * @author Baxriddinov Odiljon
 * @since 04/09/2025 20:41
 */
public class CalculatorImp implements Calculator {
    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public double divide(double a, double b) {
        if(b == 0) throw new ArithmeticException("by zero");
        return a / b;
    }
}
