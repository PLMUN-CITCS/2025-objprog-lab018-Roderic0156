import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {
        int number = getInput();
        String result = checkEvenOdd(number);
        System.out.println(number + " is an " + result + " number.");
    }

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();
        return num;
    }

    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}

