package apis;

import java.util.ArrayList;
import java.util.List;

public class ConceptualAPIImpl implements ConceptualAPIInterface {

    private final ProcessAPIInterface processApi;

    public ConceptualAPIImpl(ProcessAPIInterface processApi) {
        this.processApi = processApi;
    }

    @Override
    public ComputationResult compute(ComputationInput input) {

        int value = input.getValue();

        List<Integer> factors = new ArrayList<>();

        for (int divisor = 1; divisor <= value; divisor++) {

            if (value % divisor == 0) {
                factors.add(divisor);
            }
        }

        StringBuilder resultBuilder = new StringBuilder();

        for (int i = 0; i < factors.size(); i++) {

            resultBuilder.append(factors.get(i));

            if (i < factors.size() - 1) {
                resultBuilder.append(",");
            }
        }

        return new ComputationResult(
                resultBuilder.toString());
    }
}