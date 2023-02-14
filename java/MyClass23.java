import java.util.*;
public class MyClass23{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int roll[] = new int[4];
        String name[] = new String[4];
        String branch[] = new String[4];
        double score[] = new double[4];
        String dayScholar[] = new String[4];
        for(int i=0;i<4;i++) {
            roll[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            branch[i] = sc.nextLine();
            score[i] = sc.nextDouble();
            sc.nextLine();
            dayScholar[i] = sc.nextLine();
        }
        sc.close();
        int count = 0;
        for(int i=0;i<score.length;i++) {
            if(score[i] >= 80 && dayScholar[i].equals("true")) {
                count++;
            }
        }
        if(count == 0) {
            System.out.println("There are no such dayscholar students");
        }else{
            System.out.println(count);
        }
        ArrayList<Double> temp = new ArrayList<>();
        for(int i=0;i<score.length;i++) {
            if(dayScholar[i].equals("false")) {
                temp.add(score[i]);
            }
        }
        if(temp.size() == 0) {
            System.out.println("There are no student from non day scholar");
        } else {
            Collections.sort(temp);
            Collections.reverse(temp);
            double a = temp.get(1);
            for(int i=0;i<roll.length;i++) {
                if(a == score[i]) {
                    System.out.println(roll[i]+"#"+name[i]+"#"+a);
                }
            }
        }
    }
}