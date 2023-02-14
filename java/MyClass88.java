import java.util.*;
public class MyClass88 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int id[] = new int[4];
        String raised[] = new String[4];
        String assigned[] = new String[4];
        int p[] = new int[4];
        String pro[] = new String[4];
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            raised[i] = sc.nextLine();
            assigned[i]=sc.nextLine();
            p[i] = sc.nextInt();
            sc.nextLine();
            pro[i] = sc.nextLine();
        }
        String str = sc.nextLine();
        sc.close();
        ArrayList<Integer>temp=new ArrayList<>();
        int f=0;
        for(int i=0;i<4;i++) {
            if(str.equalsIgnoreCase(pro[i])){
                temp.add(p[i]);
                f=1;
            }
        }
        if(f==0){
            System.out.println("No such Ticket");
        } else {
            Collections.sort(temp);
            int a = temp.get(0);
            for(int i=0;i<4;i++) {
                if(a == p[i]) {
                    System.out.println(id[i]);
                    System.out.println(raised[i]);
                    System.out.println(assigned[i]);
                    break;
                }
            }
        }
    }
}