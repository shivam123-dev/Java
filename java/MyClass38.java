import java.util.*;
public class MyClass38 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        int planned[] = new int[4];
        int completed[] = new int[4];
        String purpose[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            planned[i] = sc.nextInt();
            sc.nextLine();
            completed[i] = sc.nextInt();
            sc.nextLine();
            purpose[i] = sc.nextLine();
        }
        int percent = sc.nextInt();
        sc.nextLine();
        String p = sc.nextLine();
        sc.close();
        int sum = 0, count = 0;
        for(int i=0;i<completed.length;i++) {
            int percentage = (completed[i]*100)/(planned[i]);
            if(percentage >= percent) {
                sum += completed[i];
                count++;
            }
        }
        if(count == 0) {
            System.out.println(0);
        } else {
            int avg = sum / count;
            System.out.println(avg);
        }
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();
        int f = 0;
        for(int i=0;i<purpose.length;i++) {
            if(purpose[i].equals(p)) {
                int percentage = (completed[i] * 100) / (planned[i]);
                if(percentage == 100) {
                    str2.add("Star");
                } else if(percentage<=99&&percentage>=80){
                    str2.add("Leader");
                } else if(percentage<=79&&percentage>=55){
                    str2.add("Inspirer");
                } else {
                    str2.add("Striver");
                }
                str1.add(name[i]);
                f = 1;
            }
        }
        if(f == 0) {
            System.out.println("No Navel Vessel is available with the specified purpose");
        } else {
            for(int i=0;i<str1.size();i++) {
                System.out.println(str1.get(i)+"%"+str2.get(i));
            }
        }
    }
}
