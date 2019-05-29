public class Result {
    private String port;
    private String state;
    private String service;
    private String version;

    public Result() {
    }

    public Result(String port, String state, String service, String version) {
        this.port = port;
        this.state = state;
        this.service = service;
        this.version = version;
    }

    public Result(String port, String state, String service) {
        this.port = port;
        this.state = state;
        this.service = service;
        this.version = "NULL";
    }

    @Override
    public String toString() {
        return "Result(Port="
                + port
                + "; State="
                + state
                + "; Service="
                + service
                + "; Version="
                + version
                + ")";
    }
}
