import java.util.*;
public class MyClass86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 4;
        int id[] = new int[size];
        String name[] = new String[size];
        int year[] = new int[size];
        int price[] = new int[size];
        for(int i=0;i<size;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            year[i] = Integer.parseInt(sc.nextLine());
            price[i] = Integer.parseInt(sc.nextLine());
        }
        int key1 = Integer.parseInt(sc.nextLine());
        String key2 = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<size;i++) {
            if(year[i] == key1) {
                sum+=price[i];
            }
        }
        if(sum == 0) {
            System.out.println("No Newspaper found with the mentioned attribute");
        } else {
            System.out.println(sum);
        }
        int f = 0;
        for(int i=0;i<size;i++) {
            if(key2.equalsIgnoreCase(name[i])) {
                f = 1;
                System.out.println("regNo-"+id[i]);
                System.out.println("name-"+name[i]);
                System.out.println("publicationYear-"+year[i]);
                System.out.println("price-"+price[i]);
            }
        }
        if(f == 0) {
            System.out.println("No Newspaper found with the given name");
        }
    }
}