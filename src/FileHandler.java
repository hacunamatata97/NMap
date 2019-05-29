import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    private String fileName;

    public FileHandler() {
    }

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return "null";
        }
    }
}
