package apis;

import project.annotations.ConceptualAPIPrototype;

public class ConceptualAPIPrototypeImpl implements ConceptualAPIInterface {

    @ConceptualAPIPrototype
    @Override
    public ComputationResult compute(ComputationInput input) {
        // Prototype: return dummy result
        return new ComputationResult("prototype-result");
    }
}

