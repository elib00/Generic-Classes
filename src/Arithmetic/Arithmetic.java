package Arithmetic;

public class Arithmetic<T1, T2> {
    private T1 num1;
    private T2 num2;

    public Arithmetic(T1 num1, T2 num2) {
        if (!(num1 instanceof Number) || !(num2 instanceof Number)) {
            throw new IllegalArgumentException("Invalid types!");
        }

        this.num1 = num1;
        this.num2 = num2;
        System.out.println("The type is: " + num1.getClass().getName());
        System.out.println("The type is: " + num2.getClass().getName());
    }

    public Number add() {
        return ((Number) num1).doubleValue() + ((Number) num2).doubleValue();
    }

    public Number subtract() {
        return ((Number) num1).doubleValue() - ((Number) num2).doubleValue();
    }

    public Number multiply() {
        return ((Number) num1).doubleValue() * ((Number) num2).doubleValue();
    }

    public Number divide() {
        Integer divisor = ((Number) num2).intValue();
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero not allowed!");
        }

        return ((Number) num1).doubleValue() / ((Number) num2).doubleValue();
    }

    public Number getMin() {
        return Math.min(((Number) num1).doubleValue(), ((Number) num2).doubleValue());
    }

    public Number getMax() {
        return Math.max(((Number) num1).doubleValue(), ((Number) num2).doubleValue());
    }

}
