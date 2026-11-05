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

        apis.InputSource inputSource =
                org.mockito.Mockito.mock(apis.InputSource.class);

        apis.OutputSource outputSource =
                org.mockito.Mockito.mock(apis.OutputSource.class);

        networkApi.configureJob(
                inputSource,
                outputSource,
                new Delimiters(",", ";"));

        org.junit.jupiter.api.Assertions
                .assertFalse(outputValues.isEmpty());
    }
    
    @org.junit.jupiter.api.Test
    public void testMissingInputFileHandledGracefully() {

        ProcessAPIImpl processApi =
                new ProcessAPIImpl();

        IntegerStream result =
                processApi.readInput(
                        new FileInputSource(
                                "file-does-not-exist.txt"));

        org.junit.jupiter.api.Assertions
                .assertNotNull(result);

        org.junit.jupiter.api.Assertions
                .assertEquals(
                        0,
                        result.getValues().length);
    }
}