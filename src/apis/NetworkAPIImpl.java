package apis;

import apis.NetworkAPIInterface;
import apis.InputSource;
import apis.OutputSource;
import apis.Delimiters;
import apis.JobConfiguration;
import apis.ConceptualAPIInterface;

public class NetworkAPIImpl implements NetworkAPIInterface {

    private final ConceptualAPIInterface conceptualApi;

    public NetworkAPIImpl(ConceptualAPIInterface conceptualApi) {
        this.conceptualApi = conceptualApi;
    }

    @Override
    public JobConfiguration configureJob(InputSource input,
                                         OutputSource output,
                                         Delimiters delimiters) {
        // Empty implementation for Checkpoint 3
        return null;
    }
}