package apis;

import project.annotations.NetworkAPI;

@NetworkAPI
public interface NetworkAPIInterface {

    JobConfiguration configureJob(InputSource input,
                                  OutputSource output,
                                  Delimiters delimiters);
}

