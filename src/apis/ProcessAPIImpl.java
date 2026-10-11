package apis;

import apis.ProcessAPIInterface;
import apis.InputSource;
import apis.OutputSource;
import apis.IntegerStream;
import apis.IntegerStreamResult;

public class ProcessAPIImpl implements ProcessAPIInterface {

    public ProcessAPIImpl() {
        // empty constructor for Checkpoint 3
    }

    @Override
    public IntegerStream readInput(InputSource source) {
        // Empty implementation for Checkpoint 3
        return null;
    }

    @Override
    public void writeOutput(OutputSource destination, IntegerStreamResult result) {
        // Empty implementation for Checkpoint 3
    }
}
