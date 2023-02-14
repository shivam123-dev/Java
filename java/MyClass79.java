import java.util.*;
public class MyClass79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        String branch[] = new String[4];
        double score[] = new double[4];
        boolean dayScholar[] = new boolean[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            branch[i] = sc.nextLine();
            score[i] = Double.parseDouble(sc.nextLine());
            dayScholar[i] = Boolean.parseBoolean(sc.nextLine());
        }
        sc.close();
        int count = 0;
        for(int i=0;i<4;i++) {
            if(score[i] > 80 && dayScholar[i]==true) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("There are no such dayscholar students");
        } else {
            System.out.println(count);
        }
        ArrayList<Double> temp = new ArrayList<>();
        for(int i=0;i<4;i++) {
            if(dayScholar[i] == false) {
                temp.add(score[i]);
            }
        }
        if(temp.size() == 0) {
            System.out.println("There are no student from non day scholar");
        } else {
            Collections.sort(temp);
            Collections.reverse(temp);
            double a = temp.get(1);
            for(int i=0;i<4;i++) {
                if(score[i] == a) {
                    System.out.println(id[i]+"#"+name[i]+"#"+score[i]);
                }
            }
        }
    }
}