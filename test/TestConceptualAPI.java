package apis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestConceptualAPI {

    @Test
    public void smokeTestConceptualAPI() {
        // Mock interface-typed parameter
        ComputationInput mockInput = Mockito.mock(ComputationInput.class);

        // Mock the required ProcessAPIInterface dependency
        ProcessAPIInterface mockProcessApi = Mockito.mock(ProcessAPIInterface.class);

        // Instantiate real implementation WITH the mock dependency
        ConceptualAPIImpl impl = new ConceptualAPIImpl(mockProcessApi);

        // Call the real method
        ComputationResult result = impl.compute(mockInput);

        Assertions.assertTrue(true);
    }
    
    @Test
    public void testFactorsOfOne() {

        ProcessAPIInterface mockProcessApi =
                Mockito.mock(ProcessAPIInterface.class);

        ConceptualAPIImpl impl =
                new ConceptualAPIImpl(mockProcessApi);

        ComputationInput input =
                new ComputationInput(1);

        ComputationResult result =
                impl.compute(input);

        Assertions.assertEquals(
                "1",
                result.getFormattedResult());
    }
}
