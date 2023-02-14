import java.util.*;

public class MyClass40{
    public static void main(String[] args) {
        int id[] = new int[4];
        String material[] = new String[4];
        String brand[] = new String[4];
        int price[] = new int[4];
        int capacity[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            id[i] = sc.nextInt();
            sc.nextLine();
            material[i] = sc.nextLine();
            brand[i] = sc.nextLine();
            price[i] = sc.nextInt();
            sc.nextLine();
            capacity[i] = sc.nextInt();
            sc.nextLine();
        }
        String m = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        for(int i=0;i<4;i++) {
            if(material[i].equals(m)) {
                System.out.println(price[i]);
            }
        }
        for(int i=0;i<4;i++) {
            if(brand[i].equals(b)) {
                if(capacity[i] > 1000) {
                    price[i] = price[i] - (26/100)*price[i];
                } else if(capacity[i]>500 && capacity[i] <= 1000) {
                    price[i] = price[i] - (20/100)*price[i];
                }
                System.out.println(price[i]);
            }
        }
    }
}