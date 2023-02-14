import java.util.*;
public class MyClass39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        int rank[] = new int[4];
        int played[] = new int[4];
        int scored[] = new int[4];
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            rank[i] = sc.nextInt();
            sc.nextLine();
            played[i] = sc.nextInt();
            sc.nextLine();
            scored[i] = sc.nextInt();
            sc.nextLine();
        }
        int target = sc.nextInt();
        sc.nextLine();
        sc.close();
        ArrayList<Integer> avg = new ArrayList<>();
        for(int i=0;i<4;i++) {
            if(target <= played[i]) {
                avg.add(scored[i]/played[i]);
            }
        }
        for(int i=0;i<avg.size();i++) {
            if(avg.get(i) >= 80 && avg.get(i) <= 100) {
                System.out.println("Grade A");
            } else if(avg.get(i) >= 50 && avg.get(i) <= 79) {
                System.out.println("Grade B");
            } else {
                System.out.println("Grade C");
            }
        }
    }
}