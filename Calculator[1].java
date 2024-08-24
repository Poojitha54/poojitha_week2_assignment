public class Calculator {
    public Calculator() {
        System.out.println("Calculator object created.");
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("2 + 3 + 4 = " + calculator.add(2, 3, 4));
        System.out.println("2.5 + 3.7 = " + calculator.add(2.5, 3.7));
    }
}

