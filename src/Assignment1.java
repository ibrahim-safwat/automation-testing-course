import java.util.Scanner;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* reciept printer (problem 1) */
//        System.out.println("please enter your product name: ");
//        String name = input.nextLine();
//        System.out.println("please enter your product price: ");
//        double price = input.nextDouble();
//        System.out.println("please enter your product quantity: ");
//        int quantity = input.nextInt();
//        System.out.println("please confirm if the product is in stock: ");
//        boolean stock = input.nextBoolean();
//        double totalprice =0;
//        if (quantity == 0 || stock == false) {
//             totalprice = 0;
//        } else {
//             totalprice = quantity * price;
//        }
//        System.out.println("product name: " + name + "\n" + "product price: " + price + "\n" + "product quantity: " + quantity + "\n"
//                + "product in stock: " + stock + "\n" + "total price: " + totalprice);



        /* Grade System (if/else & switch) */
//        System.out.println("please enter the grade: ");
//        int grade = input.nextInt();
//        if (grade < 0 || grade > 100) {
//            System.out.println("Please enter a valid numerical value!");
//            input.next();
//        } else {
//            if (grade >= 90) {
//                System.out.println("Grade: Excellent");
//            } else if (grade >= 75) {
//                System.out.println("Grade: Good");
//
//            } else if (grade >= 60) {
//                System.out.println("Grade: Fair");
//
//            } else if (grade < 60) {
//                System.out.println("Grade: Fail");
//
//            }
//        }

//        switch (grade / 10) {
//            case 10, 9 -> System.out.println("Grade: Excellent");
//            case 7, 8 -> {
//                if (grade >= 75) {
//                    System.out.println("Grade: Good");
//                } else if (grade < 75) {
//                    System.out.println("Grade: Fair");
//                }
//            }
//            case 6 -> System.out.println("Grade: Fair");
//            default -> System.out.println("Grade: Fail");
//
//        }



        /* array list and reverse loop*/
        String[] list = {"backpack", "orange T-shirt", "onesie", "fleece jacket", "Bolt T-shirt", "bike light"};
        /*for each loop */
//        for (String product : list) {
//            Arrays.sort(list);
//            System.out.println(product);
//        }

        /*normal for loop */
//        for (int i = 0; i < list.length; i++) {
//            Arrays.sort(list);
//        }
//        System.out.println(Arrays.toString(list));

        /*binary search*/
//        System.out.println("please enter the desired item: ");
//        String item = input.next();
//        Arrays.sort(list);
//        int search = Arrays.binarySearch(list, item);
//        System.out.println(search);

        /*reverse for loop*/
//        int b = 0;
//        for (int i = list.length; i > 0; i--) {
//            b = i - 1;
//            System.out.println(list[b]);
//        }


        /* modulus and for loop combined with && */
//        System.out.println("please enter Value: ");
//        int value = input.nextInt();
//        int i = 1;
//        String msg = "";
//        for (i = 1; i <= 30; i++) {
//            if (value % 3 == 0 && value % 5 != 0) {
//                msg = "Selenium";
//            } else if (value % 5 == 0 && value % 3 != 0) {
//                msg = "Playwright";
//            } else if (value % 5 == 0 && value % 3 == 0) {
//                msg = "both tools";
//            } else {
//                msg = "value is: " + value;
//            }
//        }
//        System.out.println(msg);

    }
}




