import java.util.*;
public class MyClass53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[4];
        String comp[] = new String[4];
        String genre[] = new String[4];
        int budget[] = new int[4];
        for(int i=0;i<4;i++) {
            name[i] = sc.nextLine();
            comp[i] = sc.nextLine();
            genre[i] = sc.nextLine();
            budget[i] = Integer.parseInt(sc.nextLine());
        }
        String key = sc.nextLine();
        sc.close();
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(genre[i])) {
                if(budget[i] > 80000000) {
                    System.out.println("High Budget Movie");
                }
            }
        }
    }
}
