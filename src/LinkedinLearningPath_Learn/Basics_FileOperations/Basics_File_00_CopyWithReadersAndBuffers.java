package LinkedinLearningPath_Learn.Basics_FileOperations;

import java.io.*;

public class Basics_File_00_CopyWithReadersAndBuffers {

    public static void main(String[] Args) {

        String sourcefile = "G:\\Artificial Intelligence\\HeyHeyJava\\src\\LinkedinLearningPath_Learn\\Basics_FileOperations\\SourceText.txt";
        String targetfile = "G:\\Artificial Intelligence\\HeyHeyJava\\src\\LinkedinLearningPath_Learn\\Basics_FileOperations\\TargetText.txt";

        try(
                FileReader fileReader = new FileReader(sourcefile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter writer = new FileWriter(targetfile);
                ) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                writer.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
