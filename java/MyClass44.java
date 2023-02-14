import java.util.*;
public class MyClass44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        sc.close();
        int count = 1;
        for(int i=1;i<size;i++) {
            if(arr[i] > arr[i-1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
