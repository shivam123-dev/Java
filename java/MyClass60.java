import java.util.*;

public class MyClass60 {
    public static void main(String [] args) {
        int id[] = new int[4];
        String skill[] = new String[4];
        String level[] = new String[4];
        int points[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            skill[i] = sc.nextLine();
            level[i] = sc.nextLine();
            points[i] = sc.nextInt();
            sc.nextLine();
        }
        String key1 = sc.nextLine();
        String key2 = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++){
            if(key1.equalsIgnoreCase(skill[i])) {
                sum += points[i];
            }
        }
        if(sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("The given Skill is not available");
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(level[i].equalsIgnoreCase(key2) && skill[i].equalsIgnoreCase(key1) && points[i] >= 20) {
                System.out.println(id[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No player is available with specified level, skill and eligibility points");
        }
    }
}