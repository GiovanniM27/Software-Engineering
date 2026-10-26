package apis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestConceptualAPI {

	@Test
	public void smokeTestConceptualAPI() {

	    ComputationInput mockInput =
	            Mockito.mock(ComputationInput.class);

	    ProcessAPIInterface mockProcessApi =
	            Mockito.mock(ProcessAPIInterface.class);

	    ConceptualAPIImpl impl =
	            new ConceptualAPIImpl(mockProcessApi);

	    ComputationResult result =
	            impl.compute(mockInput);

	    Assertions.assertNotNull(impl);
	}
}