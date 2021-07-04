public class Calculator {

    public Calculator() {

    }

    public int add(int operand1, int operand2) {
        return operand1 + operand2;
    }

    public int sub(int operand1, int operand2) {
        return operand1 - operand2;
    }

    public int mul(int operand1, int operand2) {
        return operand1 * operand2;
    }

    public int div(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (DivideByZero e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static class DivideByZero extends ArithmeticException {
        public DivideByZero(String errorMessage) {
            throw new DivideByZero("/ by zero");
        }
    }

}