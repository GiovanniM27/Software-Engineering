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

        List<Integer> inputValues = List.of(1, 10, 25);
        TestInputConfig inputConfig = new TestInputConfig(inputValues);

        List<String> outputValues = new ArrayList<>();
        TestOutputConfig outputConfig = new TestOutputConfig(outputValues);

        // Test-only ProcessAPI implementation
        ProcessAPIInterface processApi = new TestDataStoreImpl(inputConfig, outputConfig);

        // Required constructor calls
        NetworkAPIImpl networkApi = new NetworkAPIImpl();
        ConceptualAPIImpl conceptualApi = new ConceptualAPIImpl(processApi);

        // Dummy computation input
        ComputationInput computationInput = new ComputationInput(1);

        // Call compute (will return null for now)
        ComputationResult result = conceptualApi.compute(computationInput);

        // Write output
        processApi.writeOutput(null, null);

        // Intentional failure (Checkpoint 3)
        org.junit.jupiter.api.Assertions.assertFalse(outputValues.isEmpty());
    }
}
