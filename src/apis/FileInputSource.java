package apis;

public class FileInputSource implements InputSource {

    private final String filePath;

    public FileInputSource(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        return filePath;
    }
}