import java.util.Scanner;
public class spaceCharacterCount {
    public static int wordCount(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static int charCount(String s) {
        int count = 1;
        for(int i=0;i<s.length()-1;i++) {
            if(s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in);){
            String s = sc.nextLine();
            System.out.println("Number of words: " + wordCount(s));
            System.out.println("\nNumber of characters: " + charCount(s));
        }
    }
}
