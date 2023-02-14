import java.util.*;
public class MyClass10 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        int price[] = new int[4];
        int rating[] = new int[4];
        String type[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            price[i] = sc.nextInt();
            sc.nextLine();
            rating[i] = sc.nextInt();
            sc.nextLine();
            type[i] = sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        boolean flag = false;
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<type.length;i++) {
            if(type[i].equalsIgnoreCase(q) && rating[i] > 3) {
                flag = true;
                temp.add(price[i]);
            }
        }
        if(flag == false)
            System.out.println("There is no flower with given type.");
        else {
            Collections.sort(temp);
            for(int i=0;i<price.length;i++) {
                if(temp.get(0) == price[i]) {
                    System.out.println(id[i]);
                    break;
                }
            }
        }
    }
}