package Task_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // task 1
/* Don't need to create an instance of the class calculator as the methods
 are static, so I can call them using the class name directly */
//        double result1 = calculator.add(2, 3);
//        System.out.println("the result is: " + result1);
//
//        double result2 = calculator.add(5.888, 6);
//        System.out.println("the result is: " + result2);
//
//        double result3 = calculator.add(5.666, 8.999);
//        System.out.println("the result is: " + result3);
//
//        double result4 = calculator.add(2, 4.7877);
//        System.out.println("the result is: " + result4);
//
//        String formatresult = calculator.formattedresult(2.7654, 2);
//        System.out.println("the formatted result is: " + formatresult);

        //----------------------------------------
        //task 2

//        product product = new product("car", 30, 2, "convertable");
//
//        int result = product.gettotal(30, 4);
//        System.out.println(result);
//
//        String sentence = product.toString();
//        System.out.println(sentence);
//
        //----------------------------------------
        //task 3
        Testsession google = new Testsession("chrome");
        Testsession safari = new Testsession("firefox");
        Testsession firefox = new Testsession("safari");

        System.out.println(google.getinfo());
        System.out.println(safari.getinfo());
        System.out.println(firefox.getinfo());
        System.out.println(Testsession.getsessionCount());

        //----------------------------------------
        //task 4

    }

}
