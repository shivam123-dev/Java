import java.util.Scanner;
public class oddPositionCharFinder {
    public static void printOddPosChars(String s) {
        for(int i=1;i<s.length();i+=2) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);) {
            String s = sc.nextLine();
            printOddPosChars(s);
        }
    }
}
