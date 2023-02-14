import java.util.*;
public class MyClass58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String os[] = new String[4];
        String brand[] = new String[4];
        int price[] = new int[4];
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            os[i] = sc.nextLine();
            brand[i] = sc.nextLine();
            price[i] = sc.nextInt();
            sc.nextLine();
        }
        String key1 = sc.nextLine();
        String key2 = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(key1.equalsIgnoreCase(brand[i])) {
                sum += price[i];
            }
        }
        if(sum == 0) {
            System.out.println("The given Brand is not available");
        } else {
            System.out.println(sum);
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(key2.equalsIgnoreCase(os[i]) && price[i] >= 50000) {
                System.out.println(id[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No phones are available with specified os and price range");
        }
    }
}