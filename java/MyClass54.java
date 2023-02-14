import java.util.*;
public class MyClass54 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String comp[] = new String[4];
        int bal[] = new int[4];
        double rate[] = new double[4];
        String circle[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            comp[i] = sc.nextLine();
            bal[i] = Integer.parseInt(sc.nextLine());
            rate[i] = Double.parseDouble(sc.nextLine());
            circle[i] = sc.nextLine();
        }
        String keyCircle = sc.nextLine();
        double keyRate = Double.parseDouble(sc.nextLine());
        sc.close();
        
        Map<Integer, Integer> mp = new TreeMap<>();
        for(int i=0;i<4;i++) {
            if(keyCircle.equalsIgnoreCase(circle[i]) && keyRate > rate[i]) {
                mp.put(bal[i],id[i]);
            }
        }
        mp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(entry->System.out.println(entry.getValue()));
    }
}
