public class MyClass13 {
    public static void main(String[] args) {
        float price = 750.0f;
        float discount = 25.0f;
        float finalPrice = price - (discount/100)*price;
        System.out.println("------- Total amount of book -------");
        System.out.println("Original price: "+price);
        System.out.println("Discount: "+discount+" %");
        System.out.println("Final price: "+finalPrice);
    }
}
