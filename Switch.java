import java.util.Scanner;

class Switch {

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

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f =%f", number1, number2, number1 + number2);
                break;
            default:
                System.out.printf("%s is not a supported operation", operation);

        }

        // if (operation.equals("sum")) {
        // System.out.printf("%f + %f =%f", number1, number2, number1 + number2);
        // } else if (operation.equals("sub")) {
        // System.out.printf("%f - %f =%f", number1, number2, number1 - number2);

        // } else if (operation.equals("mul")) {
        // System.out.printf("%f * %f =%f", number1, number2, number1 * number2);
        // } else if (operation.equals("div")) {
        // System.out.printf("%f / %f =%f", number1, number2, number1 / number2);
        // } else {
        // System.out.println("the option u are trying is invalid");
        // }

        scanner.close();
    }
}
