package iostreams.hw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Notes {
    public static void main(String[] args) throws IOException {
//        Path notes = Files.createFile(Paths.get("src/main/resources/notes.txt"));
        Path notes = Paths.get("src/main/resources/notes.txt");
        String input = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            input = reader.readLine();
            System.out.println("Input: " + input);
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<String> lines = Files.readAllLines(notes);

        try (PrintWriter printWriter = new PrintWriter(notes.toFile())) {
            if (lines.size() >= 10) {
                for (int i = 1; i < lines.size(); i++) {
                    printWriter.println(lines.get(i));
                }
                printWriter.println(input);
                printWriter.flush();
            } else {
                for (String string : lines) {
                    printWriter.println(string);
                }
                printWriter.println(input);
                printWriter.flush();
            }


        }


    }
}
