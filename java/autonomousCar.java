import java.util.Scanner;

public class autonomousCar{
    public static void main(String[] args) {
        int carId[] = new int[4];
        String brand[] = new String[4];
        int testConducted[] = new int[4];
        int testPassed[] = new int[4];
        String env[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            carId[i] = sc.nextInt();
            sc.nextLine();
            brand[i] = sc.nextLine();
            testConducted[i] = sc.nextInt();
            testPassed[i] = sc.nextInt();
            sc.nextLine();
            env[i] = sc.nextLine();
        }
        String findEnv = sc.nextLine();
        String newBrand = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(findEnv.equals(env[i]) == true) {
                sum += testPassed[i];
            }
        }
        if(sum == 0)
            System.out.println("There are no tests passed in this particular environment");
        else
            System.out.println(sum);
        int count = 0;
        for(int i=0;i<4;i++) {
            if(brand[i].equals(newBrand) == true) {
                count = 1;
                int rating = (testPassed[i]*100)/(testConducted[i]);
                if(rating>=80) {
                    System.out.println(newBrand + "::A1");
                } else{
                    System.out.println(newBrand + "::B2");
                }
            }
        }
        if(count == 0) {
            System.out.println("No Car is available with the specified brand");
        }        
    }
}