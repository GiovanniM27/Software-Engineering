package apis;

public class NetworkAPIImpl implements NetworkAPIInterface {

    private final ConceptualAPIInterface conceptualApi;
    private final ProcessAPIInterface processApi;

    public NetworkAPIImpl(
            ConceptualAPIInterface conceptualApi,
            ProcessAPIInterface processApi) {

        this.conceptualApi = conceptualApi;
        this.processApi = processApi;
    }

    @Override
    public JobConfiguration configureJob(
            InputSource input,
            OutputSource output,
            Delimiters delimiters) {

        if (input == null ||
                output == null ||
                delimiters == null) {

            return new JobConfigurationImpl();
        }

        try {

            IntegerStream stream =
                    processApi.readInput(input);

            int[] values = stream.getValues();

            StringBuilder outputBuilder =
                    new StringBuilder();

            for (int i = 0; i < values.length; i++) {

                ComputationResult result =
                        conceptualApi.compute(
                                new ComputationInput(
                                        values[i]));

                outputBuilder.append(
                        result.getFormattedResult());

                if (i < values.length - 1) {
                    outputBuilder.append(
                            delimiters.getResultDelimiter());
                }
            }

            processApi.writeOutput(
                    output,
                    new IntegerStreamResult(
                            outputBuilder.toString()));

        } catch (Exception e) {
            // Prevent exceptions from escaping boundary
        }

        return new JobConfigurationImpl();
    }
}