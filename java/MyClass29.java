import java.util.Scanner;
public class MyClass29 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        while(n>0) {
            if((n%10)%2 == 0) {
                count++;
            }
            n/=10;
        }
        if(count > 3){
            System.out.println(count);
        } else {
            System.out.println("IT IS NOT A VALID NUMBER");
        }
    }
}