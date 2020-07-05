package iostreams.hw;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class HWStreams {
    public static void main(String[] args) throws IOException {
//        Path textFile1 = Files.createFile(Paths.get("src/main/resources/text1.txt"));
        Path textFile1 = Paths.get("src/main/resources/text1.txt");
        try (PrintWriter printWriter = new PrintWriter(textFile1.toFile())) {
            printWriter.println("Hello, first string in file!");
            printWriter.println("Hello, second string in file!");
            printWriter.println("Hello, third string in file!");
            printWriter.flush();
        }
//        Path textFile2 = Files.createFile(Paths.get("src/main/resources/text2.txt"));
        Path textFile2 = Paths.get("src/main/resources/text2.txt");
        try (PrintWriter printWriter = new PrintWriter(textFile2.toFile())) {
            printWriter.println("Hello, 4th string in file!");
            printWriter.println("Hello, 5th string in file!");
            printWriter.println("Hello, 6th string in file!");
            printWriter.flush();
        }

//        File tmp = new File("src/main/resources/tmp.txt");
//
//        textFile1.toFile().renameTo(tmp);
//        textFile2.toFile().renameTo(textFile1.toFile());
//        tmp.renameTo(textFile2.toFile());

        List<String> lines1 = Files.readAllLines(textFile1);
        List<String> lines2 = Files.readAllLines(textFile2);
        try (PrintWriter printWriter = new PrintWriter(textFile1.toFile())) {
            for (String string : lines2) {
                printWriter.println(string);
            }
            printWriter.flush();
        }
        try (PrintWriter printWriter = new PrintWriter(textFile2.toFile())) {
            for (String string : lines1) {
                printWriter.println(string);
            }
            printWriter.flush();
        }


//        File text1 = new File ("src/main/resources/text1.txt");
//        try (PrintWriter printWriter = new PrintWriter(text1)) {
//            printWriter.println("Hello, first string in file!");
//            printWriter.println("Hello, second string in file!");
//            printWriter.println("Hello, third string in file!");
//        }
//
//        File text2 = new File ("src/main/resources/text2.txt");
//        try (PrintWriter printWriter = new PrintWriter(text2)) {
//            printWriter.println("Hello, 4th string in file!");
//            printWriter.println("Hello, 5th string in file!");
//            printWriter.println("Hello, 6th string in file!");
//        }


    }
}
