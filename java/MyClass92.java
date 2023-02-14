import java.util.*;
public class MyClass92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String sname[] = new String[4];
        int score[] = new int[4];
        String cname[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            sname[i] = sc.nextLine();
            score[i] = Integer.parseInt(sc.nextLine());
            cname[i] = sc.nextLine();
        }
        String key = sc.nextLine();
        sc.close();
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(cname[i])) {
                if(score[i] < mini) {
                    mini = score[i];
                }
            }
        }
        if(mini == Integer.MAX_VALUE) {
            System.out.println("No such student found");
        } else {
            for(int i=0;i<4;i++) {
                if(mini == score[i]) {
                    System.out.println(id[i]);
                    System.out.println(sname[i]);
                    System.out.println(score[i]);
                    System.out.println(cname[i]);
                }
            }
        }
        ArrayList<Integer>res = new ArrayList<>();
        int f = 0;
        for(int i=0;i<4;i++) {
            if(score[i] > 500 && score[i] % 2 != 0) {
                res.add(score[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No such student found");
        } else {
            Collections.sort(res);
            Collections.reverse(res);
            if(res.size()>1) {
                int temp = res.get(1);
                for(int i=0;i<4;i++) {
                    if(temp == score[i]) {
                        System.out.println(id[i]);
                        System.out.println(sname[i]);
                        System.out.println(score[i]);
                        System.out.println(cname[i]);
                    }
                }
            }
            else {
                System.out.println("No such student found");
            }
                
        }
    }
}