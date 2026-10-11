package apis;

import apis.ConceptualAPIInterface;
import apis.ComputationInput;
import apis.ComputationResult;
import apis.ProcessAPIInterface;

public class ConceptualAPIImpl implements ConceptualAPIInterface {

    private final ProcessAPIInterface processApi;

    public ConceptualAPIImpl(ProcessAPIInterface processApi) {
        this.processApi = processApi;
    }

    @Override
    public ComputationResult compute(ComputationInput input) {
        // Empty implementation for Checkpoint 3
        return null;
    }
}
