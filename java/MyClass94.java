import java.util.*;
public class MyClass94 {
    public static void main(String[] args) {
        int id[] = new int[5];
        String title[] = new String[5];
        String artist[] = new String[5];
        double duration[] = new double[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            title[i] = sc.nextLine();
            artist[i] = sc.nextLine();
            duration[i] = Double.parseDouble(sc.nextLine());
        }
        String key1 = sc.nextLine();
        String key2 = sc.nextLine();
        sc.close();
        double sum = 0;
        for(int i=0;i<5;i++) {
            if(artist[i].equalsIgnoreCase(key1)) {
                sum += duration[i];
            }
        }
        if(sum == 0) {
            System.out.println("There are no songs with given artist");
        } else {
            System.out.println(sum);
        }
        ArrayList<Double>temp=new ArrayList<>();
        int f = 0;
        for(int i=0;i<5;i++) {
            if(key2.equalsIgnoreCase(artist[i])) {
                temp.add(duration[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("There are no songs with given artist");
        } else {
            Collections.sort(temp);
            int k = 0;
            while(k < temp.size()) {
                for(int i=0;i<5;i++) {
                    if(duration[i] == temp.get(k)) {
                        System.out.println(id[i]);
                        System.out.println(title[i]);
                    }
                }
                k++;
            }
        }
    }
}