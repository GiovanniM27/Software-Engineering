package apis;

import project.annotations.ConceptualAPIPrototype;

public class ConceptualAPIPrototypeImpl {

    @ConceptualAPIPrototype
    public void prototypeConceptualAPI(ConceptualAPIInterface api) {
        ComputationInput input = new ComputationInput(6);
        ComputationResult result = api.compute(input);
        // prototype does not need to do anything with result
    }
}
