package apis;

public class NetworkAPIImpl implements NetworkAPIInterface {

    private final ConceptualAPIInterface conceptualApi;
    private final ProcessAPIInterface processApi;

    public NetworkAPIImpl(
            ConceptualAPIInterface conceptualApi,
            ProcessAPIInterface processApi) {

        this.conceptualApi = conceptualApi;
        this.processApi = processApi;
    }

    @Override
    public JobConfiguration configureJob(
            InputSource input,
            OutputSource output,
            Delimiters delimiters) {

        // Coordinator implementation will be completed
        // after ProcessAPIImpl is implemented

        return null;
    }
}