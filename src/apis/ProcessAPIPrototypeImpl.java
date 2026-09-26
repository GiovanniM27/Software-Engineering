package apis;

import project.annotations.ProcessAPIPrototype;

public class ProcessAPIPrototypeImpl implements ProcessAPIInterface {

    @ProcessAPIPrototype
    @Override
    public IntegerStream readInput(InputSource source) {
        // Prototype: return empty stream
        return new IntegerStream(new int[0]);
    }

    @ProcessAPIPrototype
    @Override
    public void writeOutput(OutputSource destination, IntegerStreamResult result) {
        // Prototype: do nothing
    }
}

