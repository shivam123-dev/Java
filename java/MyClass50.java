import java.util.*;
public class MyClass50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String brand[] = new String[4];
        int conducted[] = new int[4];
        int passed[] = new int[4];
        String env[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            brand[i] = sc.nextLine();
            conducted[i] = Integer.parseInt(sc.nextLine());
            passed[i] = Integer.parseInt(sc.nextLine());
            env[i] = sc.nextLine();
        }
        String key = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(key.equals(env[i])) {
                sum += passed[i];
            }
        }
        if(sum == 0) {
            System.out.println("There are no tests passed in this particular environment");
        } else {
            System.out.println(sum);
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(b.equals(brand[i])) {
                f = 1;
                int rating = (passed[i]*100)/conducted[i];
                if(rating >= 80) {
                    System.out.println(b+"::A1");
                } else {
                    System.out.println(b+"::B2");
                }
            }
        }
        if(f == 0) {
            System.out.println("No Car is available with the specified brand");
        }
    }
}
