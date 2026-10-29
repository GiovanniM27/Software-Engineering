package apis;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class TestNetworkAPI {

    @Test
    public void smokeTestNetworkAPI() {

        InputSource mockInput =
                Mockito.mock(InputSource.class);

        OutputSource mockOutput =
                Mockito.mock(OutputSource.class);

        ConceptualAPIInterface mockConceptualApi =
                Mockito.mock(ConceptualAPIInterface.class);

        ProcessAPIInterface mockProcessApi =
                Mockito.mock(ProcessAPIInterface.class);

        Mockito.when(mockProcessApi.readInput(mockInput))
                .thenReturn(new IntegerStream(new int[] {1}));

        Mockito.when(
                mockConceptualApi.compute(
                        Mockito.any(ComputationInput.class)))
                .thenReturn(
                        new ComputationResult("1"));

        Delimiters delimiters =
                new Delimiters(",", ";");

        NetworkAPIImpl impl =
                new NetworkAPIImpl(
                        mockConceptualApi,
                        mockProcessApi);

        JobConfiguration result =
                impl.configureJob(
                        mockInput,
                        mockOutput,
                        delimiters);

        Assertions.assertNotNull(result);
    }
}