import java.util.*;
public class MyClass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TravelAgency[] arr = new TravelAgency[4];
        for(int i=0;i<arr.length;i++) {
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt(); sc.nextLine();
            boolean e = sc.nextBoolean();
            arr[i] = new TravelAgency(a, b, c, d, e);
        }
        int rNo = sc.nextInt(); sc.nextLine();
        String pType = sc.nextLine();
        sc.close();

        int user1 = findAgencyWithHighestPackagePrice(arr);
        System.out.println(user1);

        TravelAgency user2 = agencyDetails(arr, rNo, pType);
        if(user2 == null) {
            System.out.println("No such agency");
        } else {
            System.out.println(user2.getAgency()+":"+user2.getPrice());
        }
    }

    static TravelAgency agencyDetails(TravelAgency[] arr, int rNo, String pType) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i].getRegNo() == rNo && (arr[i].getPakage()).equals(pType)) {
                if(arr[i].getFacility() == true) {
                    return arr[i];
                }
            }
        }
        return null;
    }

    static int findAgencyWithHighestPackagePrice(TravelAgency[] arr) {
        int max = arr[0].getPrice();
        for(int i=1;i<arr.length;i++) {
            if(max<arr[i].getPrice()) {
                max = arr[i].getPrice();
            }
        }
        return max;
    }
}

class TravelAgency{
    private int regNo, price;
    private String agencyName, pakageType;
    private boolean flightFacility;

    public TravelAgency(int regNo, String agencyName, String pakageType, int price, boolean flightFacility) {
        this.regNo =  regNo;
        this.agencyName = agencyName;
        this.pakageType = pakageType;
        this.price = price;
        this.flightFacility = flightFacility;
    }

    public int getRegNo(){
        return regNo;
    }

    public String getAgency() {
        return agencyName;
    }

    public String getPakage(){
        return pakageType;
    }

    public int getPrice() {
        return price;
    }

    public boolean getFacility() {
        return flightFacility;
    }
}
