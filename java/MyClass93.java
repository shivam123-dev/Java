import java.util.*;
public class MyClass93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        int id[] = new int[size];
        String name[] = new String[size];
        int contact[] = new int[size];
        String address[] = new String[size];
        int pin[] = new int[size];
        for(int i=0;i<size;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            contact[i] = Integer.parseInt(sc.nextLine());
            address[i] = sc.nextLine();
            pin[i] = Integer.parseInt(sc.nextLine());
        }
        String key = sc.nextLine();
        sc.close();
        int maxPin = pin[0];
        for(int i=1;i<size;i++) {
            if(pin[i] > maxPin) {
                maxPin = pin[i];
            }
        }
        int f = 0;
        for(int i=0;i<size;i++) {
            if(maxPin == pin[i]) {
                f = 1;
                System.out.println("id-"+id[i]);
                System.out.println("name-"+name[i]);
                System.out.println("contactNo-"+contact[i]);
                System.out.println("address-"+address[i]);
                System.out.println("pincode-"+pin[i]);
                break;
            }
        }
        if(f == 0) {
            System.out.println("No college found with mentioned attribute");
        }
        f = 0;
        for(int i=0;i<size;i++) {
            if(key.equalsIgnoreCase(address[i])) {
                f = 1;
                System.out.println("id-"+id[i]);
                System.out.println("name-"+name[i]);
                System.out.println("contactNo-"+contact[i]);
                System.out.println("address-"+address[i]);
                System.out.println("pincode-"+pin[i]);
            }
        }
        if(f == 0) {
            System.out.println("No college found with mentioned attribute");
        }
    }
}