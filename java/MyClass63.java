import java.util.*;

public class MyClass63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        int planned[] = new int[4];
        int completed[] = new int[4];
        String purpose[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            planned[i] = Integer.parseInt(sc.nextLine());
            completed[i] = Integer.parseInt(sc.nextLine());
            purpose[i] = sc.nextLine();
        }
        int key1 = Integer.parseInt(sc.nextLine());
        String key2 = sc.nextLine();
        sc.close();
        int count = 0;
        int sum = 0;
        for(int i=0;i<4;i++) {
            int per = (completed[i]*100)/planned[i];
            if(per >= key1) {
                sum += completed[i];
                count++;
            }
        }
        int avg = sum/count;
        System.out.println(avg);
        int f = 0;
        for(int i=0;i<4;i++) {
            if(key2.equalsIgnoreCase(purpose[i])) {
                f = 1;
                int per = (completed[i]*100)/planned[i];
                if(per == 100) {
                    System.out.println(name[i]+"%Star");
                } else if(per >= 80 && per <= 99) {
                    System.out.println(name[i]+"%Leader");
                } else if(per >= 55 && per <= 55) {
                    System.out.println(name[i]+"%Inspirer");
                } else {
                    System.out.println(name[i]+"%Striver");
                }
            }
        }
        if(f == 0) {
            System.out.println("No Naval Vessel is available with the specified purpose");
        }
    }
}