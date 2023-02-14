import java.util.*;
public class MyClass62 {
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
        String e = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(e.equalsIgnoreCase(env[i])) {
                sum += passed[i];
            }
        }
        if(sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("There are no tests passed in this particular environment");
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(b.equalsIgnoreCase(brand[i])) {
                f = 1;
                int rating = (passed[i]*100)/conducted[i];
                if(rating >= 80) {
                    System.out.println(brand[i]+"::A1");
                } else {
                    System.out.println(brand[i]+"::B2");
                }
            }
        }
        if(f == 0) {
            System.out.println("No Car is available with the specified brand");
        }
    }
}