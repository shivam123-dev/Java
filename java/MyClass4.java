import java.util.*;

public class MyClass4 {
    public static void main(String[]args){
        int id[] = new int[4];
        String name[] = new String[4];
        String leader[] = new String[4];
        double vswr[] = new double[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            leader[i] = sc.nextLine();
            vswr[i] = sc.nextDouble();
            sc.nextLine();
        }
        String searchName = sc.nextLine();
        double VSWR = sc.nextDouble();
        sc.nextLine();
        sc.close();

        int count = 0;
        for(int i=0;i<name.length;i++) {
            if(name[i].equals(searchName)){
                count = id[i];
            }
        }
        if(count == 0) {
            System.out.println("There is no antenna with the given parameter");
        }
        else {
            System.out.println(count);
        }
        int temp = 0;
        SortedMap<Double, String> mp = new TreeMap<>();
        for(int i=0;i<vswr.length;i++){
            if(vswr[i] < VSWR) {
                mp.put(vswr[i], leader[i]);
                temp = 1;
            }
        }
        if(temp == 0) {
            System.out.println("No Antenna found");
        } else {
            for(Map.Entry<Double, String> x : mp.entrySet()) {
                System.out.println(x.getValue());
            }
        }
    }
}
