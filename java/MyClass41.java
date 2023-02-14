import java.util.*;
public class MyClass41 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        int price[] = new int[4];
        int rating[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            price[i] = Integer.parseInt(sc.nextLine());
            rating[i] = Integer.parseInt(sc.nextLine());
        }
        int q = Integer.parseInt(sc.nextLine());
        sc.close();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<4;i++) {
            if(rating[i]>q) {
                if(max < price[i]) {
                    max = price[i];
                }
            }
        }
        if(max == Integer.MIN_VALUE) {
            System.out.println("NO SUCH FRUIT");
        } else {
            for(int i=0;i<price.length;i++) {
                if(price[i] == max) {
                    System.out.println(id[i]);
                    break;
                }
            }
        }
    }
}