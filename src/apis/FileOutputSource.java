package apis;

public class FileOutputSource implements OutputSource {

    private final String filePath;

    public FileOutputSource(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}