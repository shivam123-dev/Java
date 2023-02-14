import java.util.*;
public class MyClass85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[5];
        String name[] = new String[5];
        String type[] = new String[5];
        int price[] = new int[5];
        for(int i=0;i<5;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            type[i] = sc.nextLine();
            price[i] = Integer.parseInt(sc.nextLine());
        }
        String key1 = sc.nextLine();
        String key2 = sc.nextLine();
        sc.close();
        int count = 0;
        for(int i=0;i<5;i++) {
            if(key1.equalsIgnoreCase(type[i])) {
                count++;
            }
        }
        if(count!=0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not available");
        }
        ArrayList<Integer> res = new ArrayList<>();
        int f = 0;
        for(int i=0;i<5;i++) {
            if(key2.equalsIgnoreCase(name[i])) {
                res.add(price[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("Brand not available");
        } else {
            Collections.sort(res);
            Collections.reverse(res);
            int a = res.get(1);
            for(int i=0;i<5;i++) {
                if(price[i] == a) {
                    System.out.println(id[i]);
                    System.out.println(name[i]);
                    System.out.println(price[i]);
                }
            }
        }
    }
}