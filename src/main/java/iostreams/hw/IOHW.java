package iostreams.hw;

import lombok.SneakyThrows;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class IOHW {
    public static void main(String[] args) {
        IOHW main = new IOHW();
        main.writeText("file123.txt", "Hello!");
    }

    @SneakyThrows
    public void writeText(String nameFile, String text) {
        Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource(nameFile)).toURI());
        PrintWriter printWriter = new PrintWriter(path.toFile());
            printWriter.println(text);
            printWriter.flush();


    }
}
