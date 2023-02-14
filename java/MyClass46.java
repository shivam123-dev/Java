import java.util.*;
public class MyClass46 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String skill[] = new String[4];
        String level[] = new String[4];
        int points[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            skill[i] = sc.nextLine();
            level[i] = sc.nextLine();
            points[i] = Integer.parseInt(sc.nextLine());
        }
        String sk = sc.nextLine();
        String ll = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(skill[i].equals(sk)) {
                sum += points[i];
            }
        }
        if(sum == 0) {
            System.out.println("The given Skill is not available");
        } else {
            System.out.println(sum);
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(level[i].equals(ll) && skill[i].equals(sk) && points[i] >= 20) {
                System.out.println(id[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }
}
