import java.util.*;
public class MyClass25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int id[] = new int[size];
        int played[] = new int[size];
        int runs[] = new int[size];
        String name[] = new String[size];
        String team[] = new String[size];
        for(int i=0;i<size;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            played[i] = sc.nextInt();
            sc.nextLine();
            runs[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            team[i] = sc.nextLine();
        }
        int q = sc.nextInt();
        sc.nextLine();
        sc.close();
        int min = played[0];
        for(int i=1;i<played.length;i++) {
            if(min > played[i]) {
                min = played[i];
            }
        }
        for(int i=0;i<id.length;i++) {
            if(min == played[i]) {
                System.out.println(id[i]);
            }
        }
        int c = 0;
        for(int i=0;i<id.length;i++) {
            if(id[i] == q) {
                c = 1;
                System.out.println(q);
                System.out.println(name[i]);
            }
        }
        if(c == 0) {
            System.out.println("No such Cricketer");
        }
    }
}