import java.util.*;
public class MyClass3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[5];
        String name[] = new String[5];
        String type[] = new String[5];
        int price[] = new int[5];

        for(int i=0;i<5;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            type[i] = sc.nextLine();
            price[i] = sc.nextInt();
            sc.nextLine();
        }

        String t = sc.nextLine();
        String n = sc.nextLine();

        sc.close();

        int count = 0;
        for(int i=0;i<type.length;i++) {
            if(t.equalsIgnoreCase(type[i]) == true) {
                count++;
            }
        }
        if(count == 0){
            System.out.println("Footwear not available");
        } else {
            System.out.println(count);
        }
    
        int temp = Integer.MIN_VALUE;
        ArrayList<Integer> te = new ArrayList<>();
        for(int i=1;i<price.length;i++) {
            if(n.equalsIgnoreCase(name[i]) == true) {
                temp = price[i];
                te.add(price[i]);
            }
        }
        if(temp == Integer.MIN_VALUE) {
            System.out.println("Brand not available");
        }
        else {
            Collections.sort(te);
            Collections.reverse(te);
            int a = 0;
            if(te.size()>1) {
                a = te.get(1);
            } else {
                a = te.get(0);
            }
            for(int i=0;i<price.length;i++) {
                if(a == price[i]) {
                    System.out.println(id[i]);
                    System.out.println(name[i]);
                    System.out.println(price[i]);
                }
            }
        }
    }
}