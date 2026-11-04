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

        int[] values =
                new int[inputConfig.getValues().size()];

        for (int i = 0; i < inputConfig.getValues().size(); i++) {
            values[i] = inputConfig.getValues().get(i);
        }

        return new IntegerStream(values);
    }

    @Override
    public void writeOutput(OutputSource destination,
                            IntegerStreamResult result) {

        outputConfig.getValues().add(
                result.getFormattedResult());
    }
}
