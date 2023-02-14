import java.util.*;
public class MyClass49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[5];
        String name[] = new String[5];
        String tech[] = new String[5];
        int exp[] = new int[5];
        for(int i=0;i<5;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            tech[i] = sc.nextLine();
            exp[i] = sc.nextInt();
            sc.nextLine();
        }
        String key = sc.nextLine();
        sc.close();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<5;i++) {
            if(key.equals(tech[i]) && exp[i]%5 == 0) {
                res.add(id[i]);
            }
        }
        for(int i=0;i<res.size();i++)
            System.out.println(res.get(i));
    }
}