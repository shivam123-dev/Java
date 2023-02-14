import java.util.*;
public class MyClass59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        String placed[] = new String[4];
        int cleared[] = new int[4];
        String loc[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            placed[i] = sc.nextLine();
            cleared[i] = Integer.parseInt(sc.nextLine());
            loc[i] = sc.nextLine();
        }
        String key1 = sc.nextLine();
        String key2 = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(key1.equalsIgnoreCase(loc[i])) {
                sum += cleared[i];
            }
        }
        if(sum == 0) {
            System.out.println("There are no cleared students in this particular location");
        } else {
            System.out.println(sum);
        }
        int f = 0;
        for(int i=0;i<4;i++) {
            if(key2.equalsIgnoreCase(name[i])) {
                f = 1;
                int p = Integer.parseInt(placed[i]);
                int rating = (p*100)/cleared[i];
                if(rating>=80) {
                    System.out.println(name[i]+"::A");
                } else {
                    System.out.println(name[i]+"::B");
                }
            }
        }
        if(f == 0) {
            System.out.println("No Institute is available with the specified name");
        }
    }
}