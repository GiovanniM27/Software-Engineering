package apis;

import project.annotations.NetworkAPIPrototype;

public class NetworkAPIPrototypeImpl {

    @NetworkAPIPrototype
    public void prototypeNetworkAPI(NetworkAPIInterface api) {
        InputSource mockInput = null;
        OutputSource mockOutput = null;
        Delimiters mockDelimiters = new Delimiters(",", ";");

        api.configureJob(mockInput, mockOutput, mockDelimiters);
    }
}
