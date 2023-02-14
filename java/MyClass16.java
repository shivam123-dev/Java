import java.util.Scanner;
public class MyClass16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String temp1 = "";
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
            if(temp != 'a' && temp != 'e' && temp != 'i' && temp != 'o' && 
                temp != 'u' && temp != 'A' && temp != 'E' && temp != 'I' && 
                temp != 'O' && temp != 'U') {
                temp1 += temp;
            }
        }
        System.out.println(temp1.toLowerCase());
    }   
}
