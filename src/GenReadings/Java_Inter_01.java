package GenReadings;

public class Java_Inter_01 {
    public  static void main(String args[]){
        String[] words = {"funk","chunk","funkuy","bacanator"};

        //Startswith
        for (String w: words){
            if (w.startsWith("fu")){
                System.out.println(w + "startswith");
            }
        }

        //EndsWith
        for (String w: words){
            if (w.endsWith("or")){
                System.out.println(w+ "EndsWith");
            }
        }
    }
}
