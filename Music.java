import java.util.*;
public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no[] = new int[4];
        String type[] = new String[4];
        int count[] = new int[4];
        double duration[] = new double[4];
        for(int i=0;i<4;i++) {
            no[i] = Integer.parseInt(sc.nextLine());
            type[i] = sc.nextLine();
            count[i] = Integer.parseInt(sc.nextLine());
            duration[i] = Double.parseDouble(sc.nextLine());
        }
        int key1 = Integer.parseInt(sc.nextLine());
        int key2 = Integer.parseInt(sc.nextLine());
        sc.close();
        int c = 0, sum = 0;
        for(int i=0;i<4;i++) {
            if(count[i] > key1) {
                c++;
                sum += count[i];
            }
        }
        if(c == 0) {
            System.out.println("No playlist found");
        } else {
            System.out.println(sum/c);
        }
        ArrayList<Double>res = new ArrayList<>();
        int f = 0;
        for(int i=0;i<4;i++) {
            if(duration[i] > (double)key2) {
                res.add(duration[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No playlist found with mentioned attribute");
        } else {
            Collections.sort(res);
            int k = 0;
            while(k < res.size()) {
                for(int i=0;i<4;i++) {
                    if(duration[i] == res.get(k)) {
                        System.out.println(type[i]);
                        break;
                    }
                }
                k++;
            }
        }
    }
}
