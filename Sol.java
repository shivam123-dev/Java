import java.util.Scanner;
public class Sol {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Pan[] p = new Pan[4];
        for(int i=0;i<p.length;i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String material = sc.nextLine();
            String brand = sc.nextLine();
            int price = sc.nextInt();
            sc.nextLine();
            int capacity = sc.nextInt();
            sc.nextLine();
            p[i] = new Pan(id, material, brand, price, capacity);
        }
        String material = sc.nextLine();
        String brand = sc.nextLine();
        System.out.println(costliestPan(p, material));
        System.out.println(discountedPrice(p, brand));
        sc.close();
    }
    public static String costliestPan(Pan p[], String material) {
        for(int i=0;i<p.length;i++) {
            if(p[i].material == material){
                return p[i].brand;
            }
        }
        return "No such material pan exists";
    }
    public static int discountedPrice(Pan p[], String brand) {
        for(int i=0;i<p.length;i++) {
            if(p[i].brand == brand) {
                return p[i].getDiscountedPrice();
            }
        }
        return 0;
    }
}
class Pan{
    int id;
    String material;
    String brand;
    int price;
    int capacity;

    public Pan(int id, String material, String brand, int price, int capacity) {
        this.id = id;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.capacity = capacity;
    }

    void setId(int id) {
        this.id = id;
    }

    int getId(){
        return id;
    }

    void setMaterial(String material) {
        this.material = material;
    }

    String getMaterial() {
        return material;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getBrand() {
        return brand;
    }

    void setPrice(int price) {
        this.price = price;
    }

    int getPrice() {
        return price;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    int getCapacity() {
        return capacity;
    }

    int getDiscountedPrice() {
        if(capacity > 500 && capacity <= 1000) {
            price = price - ((20/100)*price);
        }
        else if(capacity > 1000){
            price = price - ((26/100)*price);
        }
        return price;
    }
}
