import java.util.*;

public class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int carId[] = new int[4];
        String brand[] = new String[4];
        int noOfTestsConducted[] = new int[4];
        int noOfTestsPassed[] = new int[4];
        String environment[] = new String[4];
        for (int i = 0; i < 4; i++) {
            carId[i] = sc.nextInt();
            sc.nextLine();
            brand[i] = sc.nextLine();
            noOfTestsConducted[i] = sc.nextInt();
            sc.nextLine();
            noOfTestsPassed[i] = sc.nextInt();
            sc.nextLine();
            environment[i] = sc.nextLine();
        }
        String e = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (environment[i].equals(e)) {
                sum += noOfTestsPassed[i];
            }
        }
        if(sum == 0) {
            System.out.println("There are no tests passed in this particular environment");
        } else {
            System.out.println(sum);
        }
        for (int i = 0; i < 4; i++) {
            if (brand[i].equals(b)) {
                int rating = (noOfTestsPassed[i]*100)/(noOfTestsConducted[i]);
                if(rating >= 80)
                    System.out.println(brand[i]+"::A1");
                else
                    System.out.println(brand[i]+"::B2");                
            }
        }
    }
}