import java.util.*;
public class MyClass56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        int rank[] = new int[4];
        int play[] = new int[4];
        int score[] = new int[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            rank[i] = Integer.parseInt(sc.nextLine());
            play[i] = Integer.parseInt(sc.nextLine());
            score[i] = Integer.parseInt(sc.nextLine());
        }
        int target = Integer.parseInt(sc.nextLine());
        sc.close();
        for(int i=0;i<4;i++) {
            if(target <= play[i]) {
                double avg = score[i]/play[i];
                if(avg >= 80 && avg <= 100) {
                    System.out.println("Grade A");
                } else if(avg >= 50 && avg <= 79) {
                    System.out.println("Grade B");
                } else {
                    System.out.println("Grade C");
                }
            }
        }
    }
}