import java.util.*;
public class Newspaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int regNo[] = new int[4];
        String name[] = new String[4];
        int year[] = new int[4];
        int price[] = new int[4];
        for(int i=0;i<4;i++) {
            regNo[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            year[i] = Integer.parseInt(sc.nextLine());
            price[i] = Integer.parseInt(sc.nextLine());
        }
        int key1 = Integer.parseInt(sc.nextLine());
        String key2 = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(key1 == year[i]) {
                sum += price[i];
            }
        }
        if(sum == 0) {
            System.out.println("No Newspaper found with the mentioned attribute");
        } else {
            System.out.println(sum);
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(key2.equalsIgnoreCase(name[i])) {
                System.out.println("regNo-"+regNo[i]);
                System.out.println("name-"+name[i]);
                System.out.println("publicationYear-"+year[i]);
                System.out.println("price-"+price[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No Newspaper found with the given name");
        }
    }
}
