package LinkedinLearningPath_Learn.Basics_FileOperations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Basics_File_00_CopyWithPathAndFiles {

    public static void main(String[] Args) {

        Path sourceFile = Paths.get("G:","Artificial Intelligence","HeyHeyJava","src","LinkedinLearningPath_Learn","Basics_FileOperations","SourceText.txt");
        Path TargetFile00 = Paths.get("G:","Artificial Intelligence","HeyHeyJava","src","LinkedinLearningPath_Learn","Basics_FileOperations","TargetText00.txt");
//        Path sourceFile = Paths.get("LinkedinLearningPath_Learn", "Basics_FileOperations", "SourceText.txt");
//        Path TargetFile00 = Paths.get("LinkedinLearningPath_Learn", "Basics_FileOperations", "TagetText00.txt");

        try {
            Files.copy(sourceFile, TargetFile00, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
