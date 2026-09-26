package apis;

import project.annotations.ProcessAPI;

@ProcessAPI
public interface ProcessAPIInterface {

    IntegerStream readInput(InputSource source);

    void writeOutput(OutputSource destination, IntegerStreamResult result);
}

