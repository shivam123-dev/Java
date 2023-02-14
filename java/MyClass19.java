import java.util.*;
public class MyClass19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name[] = new String[4];
        String batch[] = new String[4];
        String disease[] = new String[4];
        int price[] = new int[4];
        for(int i=0;i<4;i++) {
            name[i] = sc.nextLine();
            batch[i] = sc.nextLine();
            disease[i] = sc.nextLine();
            price[i] = sc.nextInt();
            sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<disease.length;i++) {
            if(disease[i].equalsIgnoreCase(q)){
                temp.add(price[i]);
            }
        }
        if(temp.size() == 0) {
            System.out.println("No such disease");
        }else{
            Collections.sort(temp);
            for(int i=0;i<temp.size();i++) {
                System.out.println(temp.get(i));
            }
        }
    }
}