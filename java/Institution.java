import java.util.Scanner;

public class Institution {
    public static void main(String[] args) {
        int id[] = new int[4];
        String name[] = new String[4];
        int placed[] = new int[4];
        int cleared[] = new int[4];
        String location[] = new String[4];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            id[i] = sc.nextInt();
            sc.nextLine();
            name[i] = sc.nextLine();
            placed[i] = sc.nextInt();
            cleared[i] = sc.nextInt();
            sc.nextLine();
            location[i] = sc.nextLine();
        }
        String loc = sc.nextLine();
        String insName = sc.nextLine();
        sc.close();
        int sum = 0;
        for(int i=0;i<4;i++) {
            if(loc.equals(location[i])==true){
                sum += cleared[i];
            }
        }
        if(sum == 0) {
            System.out.println("There are no cleared students in this particular location");
        } else {
            System.out.println(sum);
        }
        int count = 0;
        for(int i=0;i<4;i++) {
            if(insName.equals(name[i]) == true) {
                count = 1;
                int rating = (placed[i]*100)/cleared[i];
                if(rating>=80) {
                    System.out.println(insName+"::A");
                } else {
                    System.out.println(insName + "::B");
                }
            }
        }
        if(count == 0) {
            System.out.println("No Institute is available with the specified name");
        }
    }
}
