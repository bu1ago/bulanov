import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.IOException;
import java.nio.charset.Charset;

public class classname {

    public static void main(String args[]) throws IOException {
        Path path = Paths.get("E:\\МТУСИ\\4 курс\\7 семестр\\Технологии программирования\\bulanov\\Zadanie 2\\logdet15-08-11.log");
        Charset charset = StandardCharsets.UTF_8;

        String content = new String(Files.readAllBytes(path), charset);
        content = content.replaceAll(" 0 ", "null");
        content = content.replaceAll( " 0,0 ", "null");
        Files.write(path, content.getBytes(charset));
    }

}
