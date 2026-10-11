import apis.ProcessAPIInterface;
import apis.InputSource;
import apis.OutputSource;
import apis.IntegerStream;
import apis.IntegerStreamResult;

public class TestDataStoreImpl implements ProcessAPIInterface {

    private final TestInputConfig inputConfig;
    private final TestOutputConfig outputConfig;

    public TestDataStoreImpl(TestInputConfig inputConfig, TestOutputConfig outputConfig) {
        this.inputConfig = inputConfig;
        this.outputConfig = outputConfig;
    }

    @Override
    public IntegerStream readInput(InputSource source) {
        // For Checkpoint 3, returning null is acceptable.
        return null;
    }

    @Override
    public void writeOutput(OutputSource destination, IntegerStreamResult result) {
        // For Checkpoint 3, write a simple placeholder string.
        outputConfig.getValues().add("Test output written");
    }
}
