import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class FilesManager {
    public static String[] ReadFileContent(String src) {
        List<String> content = new java.util.ArrayList<>();
        String path = "src/" + src;

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                content.add(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toArray(new String[0]);
    }

    public static void SaveContentToFile(List<String> content, String src) {
        String path = "src/" + src;

        try (FileWriter fw = new FileWriter(path)) {
            for (String line : content) {
                fw.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void AppendLineToFile(String line, String src) {
        String path = "src/" + src;

        try (FileWriter fw = new FileWriter(path, true)) {
            fw.write(line + System.lineSeparator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}