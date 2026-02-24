public class CalculatorMain {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int sum = calc.add(26, 5);
        int diff = calc.sub(10, 5);

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + diff);
    }
}