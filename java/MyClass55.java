import java.util.*;
public class MyClass55 {
    public static void main(String[] args) {
        String id[] = new String[4];
        int maxi[] = new int[4];
        int curr[] = new int[4];
        int threshold[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextLine();
            maxi[i] = Integer.parseInt(sc.nextLine());
            curr[i] = Integer.parseInt(sc.nextLine());
            threshold[i] = Integer.parseInt(sc.nextLine());
        }
        int limit = Integer.parseInt(sc.nextLine());
        sc.close();
        for(int i=0;i<4;i++) {
            if(limit >= threshold[i]) {
                if(threshold[i] > 75) {
                    System.out.println(id[i]+" Critical Filling");
                } else if(threshold[i]>=50 && threshold[i] <= 75){
                    System.out.println(id[i]+" Moderate Filling");
                } else {
                    System.out.println(id[i]+" Non-Critical Filling");
                }
            }
        }
    }
}