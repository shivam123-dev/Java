import java.util.*;
public class MyClass35 {
    public static void main(String[] args) {
        String name[] = new String[4];
        String company[] = new String[4];
        String genre[] = new String[4];
        int budget[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            name[i] = sc.nextLine();
            company[i] = sc.nextLine();
            genre[i] = sc.nextLine();
            budget[i] = sc.nextInt();
            sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        int f = 0;
        for(int i=0;i<genre.length;i++) {
            if(genre[i].equalsIgnoreCase(q)) {
                if(budget[i]>80000000) {
                    System.out.println("High Budget Movie");
                    f = 1;
                }
            }
        }
        if(f == 0)
            System.out.println("Low Budget Movie");
    }

}
