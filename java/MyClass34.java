import java.util.*;
public class MyClass34 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String director[] = new String[4];
        int rating[] = new int[4];
        int budget[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            director[i] = sc.nextLine();
            rating[i] = sc.nextInt();
            sc.nextLine();
            budget[i] = sc.nextInt();
            sc.nextLine();
        }
        String d = sc.nextLine();
        int r = sc.nextInt();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        sc.close();
        int sum = 0, count = 0;
        for(int i=0;i<director.length;i++) {
            if(director[i].equals(d)){
                sum += budget[i];
                count++;
            }
        }
        if(count == 0) {
            System.out.println("Sorry - The given director has not yet directed any movie");
        } else {
            int avg = sum/count;
            System.out.println(avg);
        }
        int g = 0;
        for(int i=0;i<budget.length;i++) {
            if(budget[i] == b && rating[i] == r) {
                if(b%r == 0) {
                    System.out.println(id[i]);
                     g = 1;
                }
            }
        }
        if(g == 0)
            System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
    }
}
