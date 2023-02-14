import java.util.*;
public class MyClass83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String country[] = new String[4];
        String side[] = new String[4];
        double price[] = new double[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            country[i] = sc.nextLine();
            side[i] = sc.nextLine();
            price[i] = Double.parseDouble(sc.nextLine());
        }
        String key = sc.nextLine();
        sc.close();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(side[i])) {
                res.add(id[i]);
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++) {
            System.out.println(res.get(i));
        }
    }
}