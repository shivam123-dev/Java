import java.util.*;
public class MyClass95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String user[] = new String[4];
        String type[] = new String[4];
        double price[] = new double[4];
        int profiles[] = new int[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            user[i] = sc.nextLine();
            type[i] = sc.nextLine();
            price[i] = Double.parseDouble(sc.nextLine());
            profiles[i] = Integer.parseInt(sc.nextLine());
        }
        String key = sc.nextLine();
        sc.close();
        int c = 0, f = 0;
        double sum = 0;
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(type[i])&&profiles[i] > 3) {
                f = 1;
                c++;
                sum += price[i];
            }
        }
        if(f == 0) {
            System.out.println("output:There are no such prime Management");
        } else {
            int avg = (int)(sum/c);
            System.out.println("output :"+avg);
        }
    }
}