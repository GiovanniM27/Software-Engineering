package project.checkpointtests;

import apis.ConceptualAPIImpl;
import apis.ConceptualAPIInterface;
import apis.Delimiters;
import apis.FileInputSource;
import apis.FileOutputSource;
import apis.NetworkAPIImpl;
import apis.ProcessAPIImpl;
import apis.ProcessAPIInterface;

public class ManualTestingFramework {

    public static final String INPUT = "manualTestInput.txt";
    public static final String OUTPUT = "manualTestOutput.txt";

    public static void main(String[] args) {

        ProcessAPIInterface processApi =
                new ProcessAPIImpl();

        ConceptualAPIInterface conceptualApi =
                new ConceptualAPIImpl(processApi);

        NetworkAPIImpl networkApi =
                new NetworkAPIImpl(
                        conceptualApi,
                        processApi);

        networkApi.configureJob(
                new FileInputSource(INPUT),
                new FileOutputSource(OUTPUT),
                new Delimiters(",", ";"));
    }
}