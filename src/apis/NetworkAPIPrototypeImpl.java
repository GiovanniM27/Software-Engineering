package apis;


import project.annotations.NetworkAPIPrototype;

public class NetworkAPIPrototypeImpl implements NetworkAPIInterface {

    @NetworkAPIPrototype
    @Override
    public JobConfiguration configureJob(InputSource input,
                                         OutputSource output,
                                         Delimiters delimiters) {
        // Prototype: no real logic yet
        return null;
    }
}
