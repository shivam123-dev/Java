import java.util.Scanner;
class Institution {
    int institutionId;
    String institutionName;
    int noOfStudentsPlaced;
    int noOfStudentsCleared;
    String location;
    String grade;
    public Institution(int id, String name, int placed, int cleared, String location) {
        institutionId = id;
        institutionName = name;
        noOfStudentsPlaced = placed;
        noOfStudentsCleared = cleared;
        this.location = location;
    }
    void setGrade(String grade) {
        this.grade = grade;
    }
}
public class MainClass {
    public static void main(String args[]) {
        Institution[] ins = new Institution[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String insName = sc.nextLine();
            int placed = sc.nextInt();
            sc.nextLine();
            int cleared = sc.nextInt();
            sc.nextLine();
            String loc = sc.nextLine();
            ins[i] = new Institution(id, insName, placed, cleared, loc);
        }
        String loc = sc.nextLine();
        String insName = sc.nextLine();
        sc.close();
        System.out.println(findNumClearancedByLoc(ins, loc));
        Institution b = updateInstitutionGrade(ins, insName);
        if(b != null) {
            System.out.println(b.institutionName+"::"+b.grade);
        } else {
            System.out.println("No Institute is available with the specified name");
        }
    }
    public static int findNumClearancedByLoc(Institution i[], String location) {
        int sum = 0;
        for(int x=0;x<i.length;x++) {
            if(location == i[x].location) {
                sum += i[x].noOfStudentsCleared;
            }
        }
        return sum;
    }
    public static Institution updateInstitutionGrade(Institution i[], String institutionName) {
        for(int x=0;x<i.length;x++) {
            if(i[x].institutionName == institutionName) {
                int rating = ((i[x].noOfStudentsPlaced)*100)/(i[x].noOfStudentsCleared);
                if(rating>=80){
                    i[x].setGrade("A");
                } else {
                    i[x].setGrade("B");
                }
                return i[x];
            }
        }
        return null;
    }
}