import java.util.Scanner;
public class perfectSquare {
    public static boolean check(int num) {
        for(int i=2;i<Math.sqrt(num);i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(check(n)) {
                System.out.println("TRUE\n");
            } else {
                System.out.println("FALSE\n");
            }
        }
    }
}
