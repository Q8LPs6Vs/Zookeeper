import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int userInput = scanner.nextInt();
        final double upperLimit = Math.sqrt(userInput);
        int i = 1;
        while (i <= upperLimit) {
            System.out.println(i * i);
            i++;
        };
    }
}