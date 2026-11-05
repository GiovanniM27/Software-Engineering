package apis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ProcessAPIImpl implements ProcessAPIInterface {

    public ProcessAPIImpl() {
    }

    @Override
    public IntegerStream readInput(InputSource source) {

        if (source == null) {
            return new IntegerStream(new int[0]);
        }

        if (!(source instanceof FileInputSource)) {
            return new IntegerStream(new int[0]);
        }

        FileInputSource fileSource =
                (FileInputSource) source;

        try {

            List<String> lines =
                    Files.readAllLines(
                            Path.of(fileSource.getFilePath()));

            int[] values =
                    new int[lines.size()];

            for (int i = 0; i < lines.size(); i++) {
                values[i] =
                        Integer.parseInt(
                                lines.get(i).trim());
            }

            return new IntegerStream(values);

        } catch (Exception e) {
            return new IntegerStream(new int[0]);
        }
    }

    @Override
    public void writeOutput(
            OutputSource destination,
            IntegerStreamResult result) {

        if (destination == null || result == null) {
            return;
        }

        if (!(destination instanceof FileOutputSource)) {
            return;
        }

        FileOutputSource fileDestination =
                (FileOutputSource) destination;

        try {

            Files.writeString(
                    Path.of(fileDestination.getFilePath()),
                    result.getFormattedResult());

        } catch (IOException e) {
            // Swallow exception at API boundary
        }
    }
}