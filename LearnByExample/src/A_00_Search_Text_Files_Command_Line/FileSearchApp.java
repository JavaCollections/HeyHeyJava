package A_00_Search_Text_Files_Command_Line;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSearchApp {

    String path;
    String regex;
    String zipFileName;
    Pattern pattern;
    List<File> zipfiles = new ArrayList<File>();

    public static void main(String[] Args) {

        FileSearchApp app = new FileSearchApp();

        switch (Math.min(Args.length, 3)) {
            case 0:
                System.out.println("USAGE: FileSearchApp path [regex] [Zipfile]");
                return;
            case 3:
                app.setZipFileName(Args[2]);
            case 2:
                app.setRegex(Args[1]);
            case 1:
                app.setPath(Args[0]);
        }

        try {
            app.walkdirectoryJava8(app.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void walkdirectory(String path) {
        // CODE TO CHECK THE ARGUMENTS
//        System.out.println("Walk Directly: " + path);
//        searchFile(null);
//        addFileToZip(null);
    }

    public void walkdirectoryJava6(String path) throws IOException {
        File dir = new File(path);
        File[] files = dir.listFiles();

        for (File file : files) {
            if (file.isDirectory()) {
                walkdirectoryJava6(file.getAbsolutePath());
            } else {
                processFile(file);
            }
        }
    }

//    public void waldirectoryJava7(String path) throws IOException {
//        Files.walkFileTree(Paths.get(path), new SimpleFileVisitor<Path>()){
//            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException
//            {
//                processFile(file.toFile());
//                return FileVisitResult.CONTINUE;
//            }
//        }
//    }

    public void walkdirectoryJava8(String path) throws IOException {
        Files.walk(Paths.get(path))
                .forEach(f -> processFile(f.toFile()));
    }

    private void processFile(File file) {
        System.out.println("Processed File" + file);

        try {
            if (searchFile(file)) {
                addFileToZip(file);
            }
        } catch (IOException | UncheckedIOException e) {
            //e.printStackTrace();
            System.out.println("Error Processing File" + file + ":" + e);
        }
    }


    public void addFileToZip(File file) {
        System.out.println("addFileToZip: " + file);
        if (getZipFileName() != null) {
            zipfiles.add(file);
        }

    }

    public boolean searchFile(File file) throws IOException {
        System.out.println("searchFile: " + file);
        return searchFileJava8(file);
    }


    public boolean searchFileJava6(File file) throws FileNotFoundException {
        boolean found = false;

        Scanner scanner = new Scanner(file, "UTF-8");
        while (scanner.hasNextLine()) {
            found = searchText(scanner.nextLine());
            if (found) {
                break;
            }
            scanner.close();
            return found;
        }
        return false;
    }

    public boolean searchFileJava7(File file) throws IOException {
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

        for (String line : lines
        ) {
            if (searchText(line)) {
                return true;
            }
        }
        return false;
    }

    public boolean searchFileJava8(File file) throws IOException {
        return Files.lines(file.toPath(), StandardCharsets.UTF_8).anyMatch(t -> searchText(t));
    }

    private boolean searchText(String text) {
//        if (this.getRegex() == null) {
//            return true;
//        }
//        return text.toLowerCase().contains(this.getRegex().toLowerCase());

        return (this.getRegex() == null) ? true :
                this.pattern.matcher(text).matches();
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
        this.pattern = Pattern.compile(regex);
    }

    public String getZipFileName() {
        return zipFileName;
    }

    public void setZipFileName(String zipFileName) {
        this.zipFileName = zipFileName;
    }
}
