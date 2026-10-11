package apis;

import project.annotations.NetworkAPI;
import apis.NetworkAPIInterface;
import apis.InputSource;
import apis.OutputSource;
import apis.Delimiters;
import apis.JobConfiguration;


public class NetworkAPIImpl implements NetworkAPIInterface {

    

    public NetworkAPIImpl() {
        // empty constructor for now
    }

    @Override
    public JobConfiguration configureJob(InputSource input,
                                          OutputSource output,
                                          Delimiters delimiters) {
        // Empty implementation for Checkpoint 3
        return null;
    }
}
