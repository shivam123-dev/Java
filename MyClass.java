public class MyClass {
    public static void main(String args[]) {
        int avg = findAvgEnginePriceByType(null, null);
        if(avg>0){
            System.out.println(avg);
        }
        else{
            System.out.println("There are no engine with given type");
        }
        boolean search = searchEngineByName(null,null);
        if(search) {
            
        }
    }
    public static int findAvgEnginePriceByType(Engine eng, String s) {

    }
    public static boolean searchEngineByName(String s, Engine eng){

    }

}
class Engine{
    int engineId;
    String engineName;
    String engineType;
    double enginePrice;

}
