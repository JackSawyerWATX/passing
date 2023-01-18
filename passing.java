import java.util.Scanner;

class passing {
    public static void main(String[] args) {
        int pass, mark;

        pass = 70;

        Scanner input = new Scanner(System.in);

        System.out.println("What was the outcome?");

        mark = input.nextInt();

        if (mark >= pass) {
            System.out.println("Passed");
        } else {
            System.out.println("Fail");
        }
    }
}