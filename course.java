import java.util.*;
public class course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int courseID[] = new int[4];
        String courseName[] = new String[4];
        String courseAdmin[] = new String[4];
        int quiz[] = new int[4];
        int handson[] = new int[4];
        for(int i=0;i<4;i++) {
            courseID[i] = Integer.parseInt(sc.nextLine());
            courseName[i] = sc.nextLine();
            courseAdmin[i] = sc.nextLine();
            quiz[i] = Integer.parseInt(sc.nextLine());
            handson[i] = Integer.parseInt(sc.nextLine());
        }
        String key1 = sc.nextLine();
        int key2 = Integer.parseInt(sc.nextLine());
        sc.close();
        int sum = 0, count = 0;
        for(int i=0;i<4;i++) {
            if(key1.equalsIgnoreCase(courseAdmin[i])) {
                sum += quiz[i];
                count++;
            }
        }
        if(count == 0) {
            System.out.println("No Course found");
        } else {
            int avg = sum / count;
            System.out.println(avg);
        }
        ArrayList<Integer> res = new ArrayList<>();
        int t = 0;
        for(int i=0;i<4;i++) {
            if(handson[i] < key2) {
                res.add(handson[i]);
                t = 1;
            }
        }
        if(t == 0) {
            System.out.println("No Course found with mentioned attribute");
        } else {
            Collections.sort(res);
            int k=0;
            for(int i=0;i<res.size();i++) {
                if(handson[i] == res.get(k++)) {
                    System.out.println(courseAdmin[i]);
                }
            }
        }
    }
}
