import java.util.ArrayList;
import java.util.List;

import apis.ConceptualAPIImpl;
import apis.Delimiters;
import apis.NetworkAPIImpl;
import apis.ProcessAPIInterface;

public class ComputeEngineIntegrationTest {

    @org.junit.jupiter.api.Test
    public void testIntegration() {

        List<Integer> inputValues =
                List.of(1, 10, 25);

        TestInputConfig inputConfig =
                new TestInputConfig(inputValues);

        List<String> outputValues =
                new ArrayList<>();

        TestOutputConfig outputConfig =
                new TestOutputConfig(outputValues);

        ProcessAPIInterface processApi =
                new TestDataStoreImpl(
                        inputConfig,
                        outputConfig);

        ConceptualAPIImpl conceptualApi =
                new ConceptualAPIImpl(processApi);

        NetworkAPIImpl networkApi =
                new NetworkAPIImpl(
                        conceptualApi,
                        processApi);

        InputSource inputSource =
                new FileInputSource("dummy.txt");

        OutputSource outputSource =
                new FileOutputSource("dummyOut.txt");

        networkApi.configureJob(
                inputSource,
                outputSource,
                new Delimiters(",", ";"));

        org.junit.jupiter.api.Assertions
                .assertFalse(outputValues.isEmpty());
    }
}