import java.util.*;
public class MyClass81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id[] = new int[4];
        String name[] = new String[4];
        String dob[] = new String[4];
        int rooms[] = new int[4];
        String cab[] = new String[4];
        double tot[] = new double[4];
        for(int i=0;i<4;i++) {
            id[i] = Integer.parseInt(sc.nextLine());
            name[i] = sc.nextLine();
            dob[i] = sc.nextLine();
            rooms[i] = Integer.parseInt(sc.nextLine());
            cab[i] = sc.nextLine();
            tot[i] = Double.parseDouble(sc.nextLine());
        }
        String key = sc.nextLine();
        sc.close();
        int booked = 0;
        for(int i=0;i<4;i++) {
            if(key.equalsIgnoreCase(cab[i]) && rooms[i] > 5) {
                booked += rooms[i];
            }
        }
        if(booked == 0) {
            System.out.println("No such rooms booked");
        } else {
            System.out.println(booked);
        }
    }
}