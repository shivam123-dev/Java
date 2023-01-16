import java.util.Scanner;
public class sumOfFirstNNaturalNumber {
    public static int findSum(int n, int sum) {
        if(n == 0)
            return sum;
        sum += n;
        return findSum(n-1, sum);
    }
    public static void main(String args[]) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(findSum(n, 0));
    }
}
