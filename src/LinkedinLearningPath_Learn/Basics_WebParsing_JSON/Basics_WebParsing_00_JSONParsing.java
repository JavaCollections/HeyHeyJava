package LinkedinLearningPath_Learn.Basics_WebParsing_JSON;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileReader;
import java.io.IOException;

public class Basics_WebParsing_00_JSONParsing {

    public static void main(String[] Args) throws IOException {

        String fileName = "G:\\Artificial Intelligence\\HeyHeyJava\\src\\LinkedinLearningPath_Learn\\Basics_WebParsing_JSON\\InputJson.json";

        Gson gson = new Gson();

        try (
                FileReader fileReader = new FileReader(fileName);
                JsonReader reader = new JsonReader(fileReader);
        ) {
            Flower[] data = gson.fromJson(reader, Flower[].class);
            for (Flower flower : data
            ) {
                System.out.println(flower);
            }
            
        }


    }
}
