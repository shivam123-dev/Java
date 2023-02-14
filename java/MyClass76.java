import java.util.*;
public class MyClass76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int id[] = new int[size];
        String name[] = new String[size];
        String type[] = new String[size];
        double amt[] = new double[size];
        boolean status[] = new boolean[size];
        for(int i=0;i<size;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            type[i] = sc.nextLine();
            amt[i] = Double.parseDouble(sc.nextLine());
            status[i] = Boolean.parseBoolean(sc.nextLine());
        }
        boolean para = Boolean.parseBoolean(sc.nextLine());
        String type1 = sc.nextLine();
        sc.close();
        double maxi = Double.MIN_VALUE;
        for(int i=0;i<size;i++) {
            if(para == status[i]) {
                if(maxi < amt[i]) {
                    maxi = amt[i];
                }
            }
        }
        if(maxi == Double.MAX_VALUE) {
            System.out.println("There are no bill with the given status");
        } else {
            for(int i=0;i<size;i++) {
                if(maxi == amt[i]) {
                    System.out.println(id[i]+"#"+name[i]);
                }
            }
        }
        int count = 0;
        for(int i=0;i<size;i++) {
            if(type1.equalsIgnoreCase(type[i])) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("There are no bills with given type of connection");
        } else {
            System.out.println(count);
        }
    }
}