import java.util.Scanner;

public class MyClass8 {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        String dob[] = new String[4];
        int rooms[] = new int[4];
        String cab[] = new String[4];
        double bill[] = new double[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            dob[i] = sc.nextLine();
            rooms[i] = sc.nextInt();
            sc.nextLine();
            cab[i] = sc.nextLine();
            bill[i] = sc.nextDouble();
            sc.nextLine();
        }
        String q = sc.nextLine();
        sc.close();
        int count = 0;
        for(int i=0;i<cab.length;i++) {
            if(cab[i].equalsIgnoreCase(q)) {
                if(rooms[i] > 5) {
                    count+=rooms[i];
                }
            }
        }
        if(count == 0) {
            System.out.println("No such rooms booked");
        } else{
            System.out.println(count);
        }
    }
}