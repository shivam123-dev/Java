import java.io.*;
public class MyClass75 {
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any 3 numbers: ");
        int n1 = Integer.parseInt(br.readLine());
        int n2 = Integer.parseInt(br.readLine());
        int n3 = Integer.parseInt(br.readLine());
        if(n1 > n2 && n1 > n3) {
            System.out.println(n1+" is greatest");
        }
        if(n2 > n1 && n2 > n3) {
            System.out.println(n2+" is greatest");
        }
        if(n3>n1&&n3>n2) {
            System.out.println(n3+" is greatest");
        }
    }
}