import java.util.*;
public class MyClass57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[4];
        String batch[] = new String[4];
        String disease[] = new String[4];
        int price[] = new int[4];
        for(int i=0;i<4;i++) {
            name[i] = sc.nextLine();
            batch[i] = sc.nextLine();
            disease[i] = sc.nextLine();
            price[i] = Integer.parseInt(sc.nextLine());
        }
        String key = sc.nextLine();
        sc.close();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(disease[i])) {
                res.add(price[i]);
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++) {
            System.out.println(res.get(i));
        }
    }
}