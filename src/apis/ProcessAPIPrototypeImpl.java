package apis;

import project.annotations.ProcessAPIPrototype;

public class ProcessAPIPrototypeImpl {

    @ProcessAPIPrototype
    public void prototypeProcessAPI(ProcessAPIInterface api) {
        // mock input source
        InputSource mockInput = null;

        // pretend to read data
        IntegerStream stream = api.readInput(mockInput);

        // mock output + result
        OutputSource mockOutput = null;
        IntegerStreamResult result = new IntegerStreamResult("mock-result");

        // pretend to write data
        api.writeOutput(mockOutput, result);
    }
}
