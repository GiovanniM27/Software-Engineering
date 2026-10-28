import java.util.ArrayList;
import java.util.List;

import apis.NetworkAPIImpl;
import apis.ConceptualAPIImpl;
import apis.ProcessAPIInterface;
import apis.ComputationInput;
import apis.ComputationResult;

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

        ComputationInput computationInput =
                new ComputationInput(1);

        ComputationResult result =
                conceptualApi.compute(computationInput);

        processApi.writeOutput(null, null);

        org.junit.jupiter.api.Assertions
                .assertFalse(outputValues.isEmpty());
    }
}