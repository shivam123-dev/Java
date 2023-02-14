import java.util.*;
public class MyClass82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int [5];
        String name[] = new String[5];
        double bal[] = new double[5];
        double rate[] = new double[5];
        String circle[] = new String[5];
        for(int i=0;i<5;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            bal[i] = Double.parseDouble(sc.nextLine());
            rate[i] = Double.parseDouble(sc.nextLine());
            circle[i] = sc.nextLine();
        }
        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        sc.close();
        ArrayList<Double> temp = new ArrayList<>();
        for(int i=0;i<5;i++) {
            if(c1.equalsIgnoreCase(circle[i])) {
                temp.add(rate[i]);
            }
        }
        Collections.sort(temp);
        Collections.reverse(temp);
        int k = 0;
        while(k < temp.size()) {
            for(int i=0;i<5;i++) {
                if(temp.get(k) == rate[i]) {
                    System.out.println(id[i]+" "+name[i]+" "+c2+" "+rate[i]);
                }
            }
            k++;
        }
    }
}