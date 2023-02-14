import java.util.*;
public class MyClass28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int id[] = new int[size];
        String name[] = new String[size];
        double scores[] = new double[size];
        int experience[] = new int[size];
        for(int i=0;i<size;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            scores[i] = sc.nextDouble();
            sc.nextLine();
            experience[i] = sc.nextInt();
            sc.nextLine();
        }
        double score = sc.nextDouble();
        sc.nextLine();
        sc.close();
        int c = 0;
        for(int i=0;i<scores.length;i++) {
            if(scores[i] == score) {
                System.out.println(id[i]);
                System.out.println(name[i]);
                c = 1;
            }
        }
        if(c == 0) {
            System.out.println("No Associate found with mentioned scores");
        }
        int max = experience[0];
        for(int i=1;i<experience.length;i++) {
            if(max < experience[i]) {
                max = experience[i];
            }
        }
        for(int i=0;i<id.length;i++) {
            if(max == experience[i]) {
                System.out.println(id[i]);
            }
        }
    }
}