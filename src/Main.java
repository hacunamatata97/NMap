import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        String text = fileHandler.readFile("nmap.txt");
        DataFilter dataFilter = new DataFilter();
        dataFilter.filter(text);
        List<Result> results = dataFilter.getResults();
        results.forEach(System.out::println);
    }
}
