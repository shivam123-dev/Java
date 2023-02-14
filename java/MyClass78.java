import java.util.*;
public class MyClass78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        sc.close();
        float arr[] = new float[size];
        for(int i=0;i<size;i++) {
            arr[i] = Float.parseFloat(sc.nextLine());
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<size;i++) {
            if(arr[i] > 0 && arr[i] <= 100) {
                temp.add((int)arr[i]);
            }
        }
        int sum = 0;
        for(int i=0;i<temp.size();i++) {
            sum += temp.get(i);
        }
        if(temp.size() == 0 || sum == 0) {
            System.out.println("No valid score found.");
        } else {
            System.out.print("Valid Scores = [");
            for(int i=0;i<temp.size();i++) {
                if(i!=temp.size()-1)
                    System.out.print(temp.get(i)+",");
            }
            System.out.println(temp.get(temp.size()-1)+"]");
        }
    }
}