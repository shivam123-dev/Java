import java.util.*;

public class MyClass6 {
    public static void main(String[] args) {
        int id[] = new int[5];
        String name[] = new String[5];
        int runs[] = new int[5];
        String playerType[] = new String[5];
        String matchType[] = new String[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            runs[i] = sc.nextInt();
            sc.nextLine();
            playerType[i] = sc.nextLine();
            matchType[i] = sc.nextLine();
        }
        String val1 = sc.nextLine();
        String val2 = sc.nextLine();
        sc.close();
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < playerType.length; i++) {
            if (val1.equals(playerType[i])) {
                if (min > runs[i]) {
                    min = runs[i];
                }
            }
        }
        if (min == Integer.MAX_VALUE) {
            System.out.println("No such player");
        } else {
            System.out.println(min);
        }

        ArrayList<Integer> temp = new ArrayList<>();

        int flag = 0;
        for (int i = 0; i < matchType.length; i++) {
            if (matchType[i].equals(val2)) {
                temp.add(id[i]);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("No Player with given matchType");
        } else {
            Collections.sort(temp);
            Collections.reverse(temp);
            for (int i = 0; i < temp.size(); i++) {
                System.out.println(temp.get(i));
            }
        }
    }
}