
class Calculator {

 public static int powerInt(int n1, int n2) {
        return (int) Math.pow(n1, n2);
    }

    public static double powerDouble(double n1, int n2) {
        return Math.pow(n1, n2);
    }
}

    public static void main(String[] args) {

        int Result = Calculator.powerInt(2, 5);
        System.out.println("2^5 = " + Result);

        double dResult = Calculator.powerDouble(2.5, 3);
        System.out.println("2.5^3 = " + dResult);
    }
