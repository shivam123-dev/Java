import java.util.*;
public class MyClass97 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int id[]=new int[4];
        String name[]=new String[4];
        String lead[]= new String[4];
        double vswr[]=new double[4];
        for(int i=0;i<4;i++){
            id[i]=Integer.parseInt(sc.nextLine());
            name[i]=sc.nextLine();
            lead[i]=sc.nextLine();
            vswr[i]=Double.parseDouble(sc.nextLine());
        }
        String key1 =sc.nextLine();
        double key2=sc.nextDouble();
        sc.nextLine();
        sc.close();
        int f=0;
        for(int i=0;i<4;i++){
            if(key1.equalsIgnoreCase(name[i])){
                f=1;
                System.out.println(id[i]);
            }
        }
        if(f == 0){
            System.out.println("There is no antenna with given parameter");
        }
        ArrayList<Double>t=new ArrayList<>();
        f=0;
        for(int i=0;i<4;i++){
            if(vswr[i]<key2){
                t.add(vswr[i]);
                f=1;
            }
        }
        if(f==0){
            System.out.println("No Antenna found");
        } else{
            Collections.sort(t);
            int k=0;
            while(k<t.size()) {
                for(int i=0;i<4;i++) {
                    if(t.get(k)==vswr[i]){
                        System.out.println(lead[i]);
                    }
                }
                k++;
            }
        }
    }
}