import java.util.*;
public class MyClass9 {
    public static void main(String[] args) {
        int id[] = new int[5];
        String name[] = new String[5];
        double balance[] = new double[5];
        double rate[] = new double[5];
        String circle[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            balance[i] = sc.nextDouble();
            sc.nextLine();
            rate[i] = sc.nextDouble();
            sc.nextLine();
            circle[i] = sc.nextLine();
        }
        String circle1 = sc.nextLine();
        String circle2 = sc.nextLine();
        sc.close();
        ArrayList<Double> temp = new ArrayList<>();
        for(int i=0;i<circle.length;i++) {
            if(circle[i].equalsIgnoreCase(circle2)) {
                temp.add(rate[i]);
                circle[i] = circle1;
            }
        }
        Collections.sort(temp);
        Collections.reverse(temp);
        while(temp.size()>0) {
            int k = 0;
            for(int i=0;i<rate.length;i++) {
                if(k<temp.size()&&temp.get(k) == rate[i]) {
                    System.out.println(id[i]+" "+name[i]+" "+circle[i]+" "+rate[i]);
                    temp.remove(k);
                    k++;
                }
            }
        }
    }
}
