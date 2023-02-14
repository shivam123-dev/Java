import java.util.*;
public class MyClass12 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String raised[] = new String[4];
        String assigned[] = new String[4];
        int priority[] = new int[4];
        String project[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            raised[i] = sc.nextLine();
            assigned[i] = sc.nextLine();
            priority[i] = sc.nextInt();
            sc.nextLine();
            project[i] = sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<priority.length;i++) {
            if(priority[i] < min && q.equalsIgnoreCase(project[i])) {
                min = priority[i];
            }
        }
        if(min == Integer.MAX_VALUE) {
            System.out.println("No such ticket");
        } else {
            for(int i=0;i<priority.length;i++) {
                if(priority[i] == min) {
                    System.out.println(id[i]);
                    System.out.println(raised[i]);
                    System.out.println(assigned[i]);
                }
            }
        }
    }
}
