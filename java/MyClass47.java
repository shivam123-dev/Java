import java.util.*;
public class MyClass47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int billNo[] = new int[size];
        String name[] = new String[size];
        String type[] = new String[size];
        double amount[] = new double[size];
        boolean status[] = new boolean[size];
        for(int i=0;i<size;i++) {
            billNo[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            type[i] = sc.nextLine();
            amount[i] = Double.parseDouble(sc.nextLine());
            status[i] = Boolean.parseBoolean(sc.nextLine());
        }
        boolean b = Boolean.parseBoolean(sc.nextLine());
        String t = sc.nextLine();
        sc.close();
        double max = Double.MIN_VALUE;
        for(int i=0;i<size;i++) {
            if(status[i] == b) {
                if(max < amount[i]) {
                    max = amount[i];
                }
            }
        }
        if(max == Double.MIN_VALUE) {
            System.out.println("There are no bill with the given status");
        } else {
            for(int i=0;i<size;i++) {
                if(max == amount[i]) {
                    System.out.println(billNo[i]+"#"+name[i]);
                }
            }
        }
        int count = 0;
        for(int i=0;i<size;i++) {
            if(type[i].equals(t)) {
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
