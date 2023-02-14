import java.util.*;
public class MyClass90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        int cust[] = new int[4];
        String city[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            cust[i] = Integer.parseInt(sc.nextLine());
            city[i] = sc.nextLine();
        }
        String key = sc.nextLine();
        sc.close();
        int c = 0, sum = 0;
        for(int i=0;i<4;i++) {
            if(key.equals(city[i])) {
                c++;
                sum += cust[i];
            }
        }
        if(c == 0) {
            System.out.println("Bank not Found");
        } else {
            int avg = sum/c;
            System.out.println(avg);
        }
        ArrayList<Integer>temp=new ArrayList<>();
        int f = 0;
        for(int i=0;i<4;i++) {
            if(cust[i]%2 == 0) {
                temp.add(cust[i]);
                f = 1;
            }
        }
        if(f == 0 || temp.size() == 1) {
            System.out.println("Bank not Found");
        } else {
            Collections.sort(temp);
            int a;
            if(temp.size() > 1) {
                a = temp.get(1);
                for(int i=0;i<4;i++) {
                    if(cust[i] == a) {
                        System.out.println(id[i]);
                        System.out.println(name[i]);
                        System.out.println(cust[i]);
                        System.out.println(city[i]);
                    }
                }
            }
        }
    }
}