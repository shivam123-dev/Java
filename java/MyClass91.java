import java.util.*;
public class MyClass91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int id[] = new int[size];
        String name[] = new String[size];
        int marks[] = new int[size];
        int age[] = new int[size];
        for(int i=0;i<size;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            marks[i] = Integer.parseInt(sc.nextLine());
            age[i] = Integer.parseInt(sc.nextLine());
        }
        int key = Integer.parseInt(sc.nextLine());
        sc.close();
        int maxi = age[0];
        for(int i=1;i<size;i++) {
            if(maxi < age[i]) {
                maxi = age[i];
            }
        }
        for(int i=0;i<size;i++) {
            if(maxi == age[i]) {
                System.out.println("id-"+id[i]);
                System.out.println("name-"+name[i]);
                System.out.println("marks-"+marks[i]);
                System.out.println("age-"+age[i]);
            }
        }
        for(int i=0;i<size;i++) {
            if(key == id[i]) {
                System.out.println("id-"+id[i]);
                System.out.println("name-"+name[i]);
                System.out.println("marks-"+marks[i]);
                System.out.println("age-"+age[i]);
            }
        }
    }
}