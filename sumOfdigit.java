import java.util.Scanner;
public class sumOfdigit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num = sc.nextInt();
        sc.close();
        while(num>0) {
            sum += num%10;
            num /= 10;
        }
        if(sum%3 == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
