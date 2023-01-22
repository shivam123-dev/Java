
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class car {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AutonomousCar[] a = new AutonomousCar[4];
        for (int i = 0; i < 4; i++) {
            a[i].setCarId(sc.nextInt());
            a[i].setBrand(sc.nextLine());
            a[i].setNoOfTestsConducted(sc.nextInt());
            // sc.nextLine();
            a[i].setNoOfTestsPassed(sc.nextInt());
            // sc.nextLine();
            a[i].setEnvironment(sc.nextLine());
        }
        String e = sc.nextLine();
        String b = sc.nextLine();
        sc.close();
        int testPassed = findTestPassedByEnv(a, e);
        if (testPassed >= 0) {
            System.out.println("There are no tests passed in this particular environment");
        }
        AutonomousCar ac = updateCarGrade(b, a);
        System.out.println(ac.getBrand() + "::" + ac.getGrade());
    }

    public static int findTestPassedByEnv(AutonomousCar[] ac, String env) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (ac[i].getEnvironment() == env) {
                sum += ac[i].getTestsPassed();
            }
        }
        return sum;
    }

    public static String findGrade(int passed, int conducted) {
        int rating = (passed * 100) / (conducted);
        if (rating >= 80) {
            return "A1";
        } else {
            return "B2";
        }
    }

    public static AutonomousCar updateCarGrade(String brand, AutonomousCar[] ac) {
        AutonomousCar bc = new AutonomousCar();
        for (int i = 0; i < 4; i++) {
            if (brand == ac[i].getBrand()) {
                ac[i].setGrade(findGrade(ac[i].getTestsPassed(), ac[i].getTestsConducted()));
                bc = ac[i];
            }
        }
        return bc;
    }
}

class AutonomousCar {
    int carId;
    String brand;
    int noOfTestsConducted;
    int noOfTestsPassed;
    String environment;
    String grade;

    void setCarId(int id) {
        carId = id;
    }

    int getCarId() {
        return carId;
    }

    void setBrand(String b) {
        brand = b;
    }

    String getBrand() {
        return brand;
    }

    void setNoOfTestsConducted(int t) {
        noOfTestsConducted = t;
    }

    int getTestsConducted() {
        return noOfTestsConducted;
    }

    void setNoOfTestsPassed(int t) {
        noOfTestsPassed = t;
    }

    int getTestsPassed() {
        return noOfTestsPassed;
    }

    void setEnvironment(String env) {
        environment = env;
    }

    String getEnvironment() {
        return environment;
    }

    void setGrade(String g) {
        grade = g;
    }

    String getGrade() {
        return grade;
    }
}
