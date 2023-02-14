import java.util.*;
public class MyClass24{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int spaces = 0, characters = 0;
        String s = sc.nextLine();
        sc.close();
        for(int i=0;i<s.length();i++) {
            char temp = s.charAt(i);
            if(temp == ' ') {
                spaces++;
            }
            else if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')){
                characters++;
            }
        }
        System.out.println("No of spaces : "+spaces+" and characters : "+characters);
    }
}