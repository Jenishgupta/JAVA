class Calculator
{
    public static void main(String[] args)
    {
        if (args.length < 3) {
            System.out.println("Usage: java Calculator <num1> <operator> <num2>");
            System.out.println("Example: java Calculator 10 + 5");
            return;
        }

        double a = Double.parseDouble(args[0]);
        String operator = args[1];
        double b = Double.parseDouble(args[2]);
        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed!");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator! Use one of: +, -, *, /");
                return;
        }

        System.out.println("Result: " + result);
    }
}
