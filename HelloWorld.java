// import java.util.Scanner;

// class HelloWorld {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("enter the first num");
//         double number1 = scanner.nextDouble();
//         scanner.nextLine();
//         System.out.println("enter the sec num");
//         double number2 = scanner.nextDouble();
//         scanner.nextLine();

//         System.out.println("what operation do u want");
//         String operation = scanner.nextLine();

//         if (operation.equals("sum")) {
//             System.out.printf("%f + %f =%f", number1, number2, number1 + number2);
//         } else if (operation.equals("sub")) {
//             System.out.printf("%f - %f =%f", number1, number2, number1 - number2);

//         }

//         scanner.close();
//     }
// }
import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first num");
        double number1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("enter the sec num");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("what operation do u want");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f =%f", number1, number2, number1 + number2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f =%f", number1, number2, number1 - number2);

        }

        scanner.close();
    }
}