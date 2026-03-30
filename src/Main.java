public class Main {

    public static void main(String[] args) {
        exercise1_TypeDependentMeaning();
        exercise2_ArithmeticOperators();
    }

    public static void exercise1_TypeDependentMeaning() {
        System.out.println("--- Type-Dependent Meaning ---");
        int a = 2 + 3;
        String s = "Tech" + "Corp";
        System.out.println("int: " + a);
        System.out.println("String: " + s);
        boolean result = true && false;
        System.out.println("boolean: " + result);
        System.out.println();
    }

    public static void exercise2_ArithmeticOperators() {
        System.out.println("--- Arithmetic Operators ---");
        int sum = 7 + 5;
        double total = 2.5 + 1.5;
        int difference = 10 - 4;
        double balance = 100.0 - 35.5;
        int product = 3 * 4;
        double scaled = 2.5 * 3;
        int result1 = 7 / 2;
        double result2 = 7.0 / 2;
        int remainder = 7 % 2;

        System.out.println("sum: " + sum);
        System.out.println("total: " + total);
        System.out.println("difference: " + difference);
        System.out.println("balance: " + balance);
        System.out.println("product: " + product);
        System.out.println("scaled: " + scaled);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("remainder: " + remainder);
        System.out.println();
    }
}
