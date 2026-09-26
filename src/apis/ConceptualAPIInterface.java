package apis;

import project.annotations.ConceptualAPI;

@ConceptualAPI
public interface ConceptualAPIInterface {

    ComputationResult compute(ComputationInput input);
}

