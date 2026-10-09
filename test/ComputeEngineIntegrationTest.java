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

        // Step 1: Create test-only input and output configs
        List<Integer> inputValues = List.of(1, 10, 25);
        TestInputConfig inputConfig = new TestInputConfig(inputValues);

        List<String> outputValues = new ArrayList<>();
        TestOutputConfig outputConfig = new TestOutputConfig(outputValues);

        // Step 2: Create the test-only ProcessAPI implementation
        TestDataStoreImpl dataStore = new TestDataStoreImpl(inputConfig, outputConfig);

        // Step 3: Instantiate the real API implementations (required by static analyzer)
        NetworkAPIImpl networkApi = new NetworkAPIImpl();
        ConceptualAPIImpl conceptualApi = new ConceptualAPIImpl();

        // Step 4: Create a dummy ComputationInput (your real engine isn't implemented yet)
        ComputationInput computationInput = new ComputationInput(inputValues);

        // Step 5: Call the conceptual API (this will return null for now)
        ComputationResult result = conceptualApi.compute(computationInput);

        // Step 6: Write something to the output using the test-only data store
        
        dataStore.writeOutput(null, null);

        // Step 7: Validate output (this will fail — expected for Checkpoint 3)
        org.junit.jupiter.api.Assertions.assertFalse(outputValues.isEmpty());
    }
}
