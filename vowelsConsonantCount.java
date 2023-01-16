import java.util.*;
public class vowelsConsonantCount{
    public static void countVowels(String input) {
        int count = 0;
        for(int i=0;i<input.length();i++) {
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Vowels count: " + count);
    }
    public static void countConsonants(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) != 'a' || input.charAt(i) != 'e' || input.charAt(i) != 'i' || input.charAt(i) != 'o'
                    || input.charAt(i) != 'u') && ((input.charAt(i)>='a'&&input.charAt(i)<='z')|| input
                            .charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
                count++;
            }
        }
        System.out.println("Consonants count: " + count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        countVowels(input);
        countConsonants(input);
    }
}