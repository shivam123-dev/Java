import java.util.*;
public class MyClass22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id[] = new String[4];
        int maximum[] = new int[4];
        int current[] = new int[4];
        int threshold[] = new int[4];
        for(int i=0;i<4;i++) {
            id[i] = sc.nextLine();
            maximum[i] = sc.nextInt();
            sc.nextLine();
            current[i] = sc.nextInt();
            sc.nextLine();
            threshold[i] = sc.nextInt();
            sc.nextLine();
        }
        int limit = sc.nextInt();
        sc.nextLine();
        sc.close();
        for(int i=0;i<threshold.length;i++) {
            if(threshold[i] <= limit) {
                if(threshold[i] >= 75){
                    System.out.println(id[i] + " Critical Filling");
                } else if(threshold[i] >= 50 && threshold[i] <= 74) {
                    System.out.println(id[i]+" Moderate Filling");
                } else{
                    System.out.println(id[i]+" Non-Critical Filling");
                }
            }
        }
    }
}