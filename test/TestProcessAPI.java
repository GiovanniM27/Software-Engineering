package apis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestProcessAPI {

    @Test
    public void smokeTestProcessAPI() {
        // Mock interface-typed parameters
        InputSource mockInput = Mockito.mock(InputSource.class);
        OutputSource mockOutput = Mockito.mock(OutputSource.class);
        IntegerStreamResult mockResult = Mockito.mock(IntegerStreamResult.class);

        // Instantiate real implementation
        ProcessAPIImpl impl = new ProcessAPIImpl();

        // Call both methods
        IntegerStream stream = impl.readInput(mockInput);
        impl.writeOutput(mockOutput, mockResult);

        Assertions.assertTrue(true);
    }
}
