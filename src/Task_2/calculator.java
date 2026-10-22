package Task_2;

public class calculator {
    public static double add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double add(double num1, int num2) {
        return num1 + num2;
    }

    public static double add(int num1, double num2) {
        return num1 + num2;
    }

    public static String formattedresult(double value, int decimals) {
        String formatting = "%." + decimals + "f";
        return String.format(formatting, value);
    }
}


