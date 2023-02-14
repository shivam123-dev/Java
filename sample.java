import java.io.*;

public class sample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three numbers: ");
        int a, b, c;
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        if (a == b && b == c) {
            System.out.println("All are equal");
        } else {
            if (a >= b) {
                if (a >= c) {
                    if (b >= c) {
                        System.out.println(c + "," + b + "," + a);
                    } else {
                        System.out.println(b + "," + c + "," + a);
                    }
                } else {
                    System.out.println(b + "," + a + "," + c);
                }
            } else {
                if (b >= c) {
                    if (c >= a) {
                        System.out.println(a + "," + c + "," + b);
                    } else {
                        System.out.println(c + "," + a + "," + b);
                    }
                } else {
                    System.out.println(a + "," + b + "," + c);
                }
            }
        }
    }
}
