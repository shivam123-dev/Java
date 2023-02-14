import java.util.*;

public class MyClass {
    public static void main(String[] args) {
        Hotel[] arr = new Hotel[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            String e = sc.nextLine();
            Double f = sc.nextDouble(); sc.nextLine();
            arr[i] = new Hotel(a,b,c,d,e,f);
        }
        String m = sc.nextLine();
        String key = sc.nextLine();
        sc.close();
        Hotel user1 = roomsBooked(arr, m);
        if (user1 == null) {
            System.out.println("No rooms booked in the given month");
        } else {
            System.out.println(user1.getRooms());
        }
        searchHotel(arr, key);
    }

    static Hotel roomsBooked(Hotel[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getMonth()).equals(str)) {
                return arr[i];
            }
        }
        return null;
    }

    static void searchHotel(Hotel[] arr, String str) {
        SortedMap<Double, Integer> list = new TreeMap<>();
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i].getWifi()).equals(str)) {
                list.put(arr[i].getBill(), arr[i].getId());
                c = 1;
            }
        }
        if (c == 0) {
            System.out.println("No such option available");
        } else {
            int count = 0;
            for (Map.Entry<Double, Integer> mapElement:list.entrySet()) {
                if(count == 1) {
                  System.out.println(mapElement.getValue());
                  break;
                }
                count++;  
            }          
        }
    }
}

class Hotel {
    int hotelId;
    String hotelName;
    String dob;
    int rooms;
    String wifi;
    double bill;

    Hotel(int hotelId, String hotelName, String dob, int rooms, String wifi, double bill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dob = dob;
        this.rooms = rooms;
        this.wifi = wifi;
        this.bill = bill;
    }

    int getId() {
        return hotelId;
    }

    String getHotelName() {
        return hotelName;
    }

    String getMonth() {
        String month = "";
        for (int i = 3; dob.charAt(i) != '-'; i++) {
            month += dob.charAt(i);
        }
        return month;
    }

    int getRooms() {
        return rooms;
    }

    String getWifi() {
        return wifi;
    }

    double getBill() {
        return bill;
    }
}