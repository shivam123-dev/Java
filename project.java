import java.util.Scanner;
public class project {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int myNumber = (int)(Math.random() * 100);
            int num=0;
            do {
                System.out.print("Enter your guess: ");
                num = sc.nextInt();
                if(num == -1)
                    break;
                else if(num > myNumber)
                    System.out.println("The original number is less than the guessed number");
                else if(num < myNumber)
                    System.out.println("The original number is greater than the guessed number");
                else {
                    System.out.println("You did it!");
                    break;
                }
            } while(num >= 0);
            System.out.println("The number is : " + myNumber);
        }
    }

}
