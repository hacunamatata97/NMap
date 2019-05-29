import java.util.ArrayList;
import java.util.List;

public class DataFilter {

    private List<Result> results;

    public DataFilter() {
        results = new ArrayList<>();
    }

    public List<Result> getResults() {
        return results;
    }

    public void filter(String text) {
        String[] ss = text.split("\n");
        for (String s : ss) {
            if (!s.isEmpty()) {
                char c = s.charAt(0);
                if (Character.isDigit(c) && s.contains("/")) {
                    Result result = buildResult(s);
                    results.add(result);
                }
            }
        }
    }

    private Result buildResult(String text) {
        String[] fields = text.split("\\s+");
        if (fields.length == 3) {
            return new Result(fields[0], fields[1], fields[2]);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 3; i < fields.length; i++) {
            sb.append(fields[i]).append(" ");
        }
        return new Result(fields[0], fields[1], fields[2], sb.toString());
    }
}
