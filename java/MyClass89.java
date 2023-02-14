import java.util.*;
public class MyClass89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        int price[] = new int[4];
        int rating[] = new int[4];
        String type[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            price[i] = Integer.parseInt(sc.nextLine());
            rating[i] = Integer.parseInt(sc.nextLine());
            type[i] = sc.nextLine();
        }
        String key = sc.nextLine();
        sc.close();
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(type[i])) {
                if(mini > price[i]) {
                    mini = price[i];
                }
            }
        }
        if(mini == Integer.MAX_VALUE) {
            System.out.println("There is no flower with given type");
        } else {
            for(int i=0;i<price.length;i++) {
                if(price[i] == mini) {
                    System.out.println(id[i]);
                }
            }
        }
    }
}