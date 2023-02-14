import java.util.*;
public class MyClass5 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        String admin[] = new String[4];
        int quiz[] = new int[4];
        int handson[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            admin[i] = sc.nextLine();
            quiz[i] = sc.nextInt();
            sc.nextLine();
            handson[i] = sc.nextInt();
            sc.nextLine();
        }
        String adminName = sc.nextLine();
        int val = sc.nextInt();
        sc.nextLine();
        sc.close();
        int sum = 0, count = 0;
        for(int i=0;i<admin.length;i++) {
            if(admin[i].equals(adminName)) {
                sum += quiz[i];
                count++;
            }
        }
        if(sum == 0) 
            System.out.println("No Course found");
        else
            System.out.println(sum/count);
        SortedMap<Integer, String> mp = new TreeMap<>();
        int temp = 0;
        for(int i=0;i<handson.length;i++) {
            if(handson[i] < val) {
                mp.put(handson[i], name[i]);
                temp = 1;
            }
        }
        if(temp == 0) {
            System.out.println("No Course found with mentioned attributes");
        } else {
            for(Map.Entry<Integer, String> m:mp.entrySet()) {
                System.out.println(m.getValue());
            }
        }
    }
}
