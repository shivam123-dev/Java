import java.util.Scanner;
public class MyClass15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        int vowel = 0, consonant = 0;
        for(int i=0;i<s.length();i++) {
            char a = s.charAt(i);
            if((a>='a'&&a<='z')||(a>='A'&&a<='Z')) {
                if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Number of Vowels: "+vowel);
        System.out.println("Number of Consonants: "+consonant);
    }
}
